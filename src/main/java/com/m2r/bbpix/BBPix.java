package com.m2r.bbpix;

import com.m2r.bbpix.barcode.BarcodeBB;
import com.m2r.bbpix.barcode.BarcodeBase;
import com.m2r.bbpix.client.BBPixClient;
import com.m2r.bbpix.dto.ArrecadacaoGetResponse;
import com.m2r.bbpix.dto.ArrecadacaoPostRequest;
import com.m2r.bbpix.dto.ArrecadacaoPostResponse;
import com.m2r.bbpix.dto.TokenResponse;
import feign.Feign;
import feign.Logger;
import feign.form.FormEncoder;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.slf4j.Slf4jLogger;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

public class BBPix {

    private static final SimpleDateFormat SDF = new SimpleDateFormat("dd.MM.yyyy");
    private static final String GRANT_TYPE = "client_credentials";
    private static final String SCOPE = "pix.arrecadacao-requisicao pix.arrecadacao-info";

    private BBPixFactory factory;

    public BBPix(BBPixFactory factory) {
        this.factory = factory;
    }

    protected BBPixClient createAuthClient() {
        return Feign.builder()
                .encoder(new FormEncoder(new GsonEncoder()))
                .decoder(new GsonDecoder())
                .logger(new Slf4jLogger(BBPixClient.class))
                .logLevel(Logger.Level.FULL)
                .target(BBPixClient.class, factory.getAmbiente().getAuthUrl());
    }

    protected BBPixClient createClient() {
        return Feign.builder()
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .logger(new Slf4jLogger(BBPixClient.class))
                .logLevel(Logger.Level.FULL)
                .target(BBPixClient.class, factory.getAmbiente().getUrl());
    }

    protected TokenResponse getToken() {
        String accessToken = Base64.getEncoder().encodeToString(String.format("%s:%s", factory.getClientId(), factory.getClientSecret()).getBytes());
        return createAuthClient().token(accessToken, GRANT_TYPE, SCOPE);
    }

    public ArrecadacaoPostResponse gerarPixArrecadacao(ArrecadacaoPostRequest payload) {
        TokenResponse tokenResponse = getToken();
        Integer valor = payload.getValorOriginalSolicitacao().multiply(new BigDecimal("100")).setScale(0, BigDecimal.ROUND_DOWN).intValue();
        Date vencimento = null;
        if (payload.getDataVencimentoSolicitacao() != null) {
            try {
                vencimento = SDF.parse(payload.getDataVencimentoSolicitacao());
            } catch (ParseException e) {
                throw new RuntimeException("A data não está no formato DD.MM.AAAA");
            }
        }
        BarcodeBase barcode = BarcodeBB.builder()
                .valor(valor)
                .dataVencimento(vencimento)
                .build();
        payload.setCodigoGuiaRecebimento(barcode.gerar());
        return createClient().postArrecadacaoPix(tokenResponse.getAccess_token(), factory.getAmbiente().getAppKeyName(), factory.getAppKey(), payload);
    }

    public ArrecadacaoGetResponse obterPixArrecadacao(Integer numeroConvenio, String codigoConciliacaoSolicitante) {
        if (codigoConciliacaoSolicitante == null) {
            throw new RuntimeException("Codigo de conciliacao do solicitante não informado");
        }
        TokenResponse tokenResponse = getToken();
        return createClient().getArrecadacaoPix(tokenResponse.getAccess_token(), factory.getAmbiente().getAppKeyName(), factory.getAppKey(), numeroConvenio, codigoConciliacaoSolicitante);
    }

}
