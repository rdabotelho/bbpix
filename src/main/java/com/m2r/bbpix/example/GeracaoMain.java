package com.m2r.bbpix.example;

import com.m2r.bbpix.BBPix;
import com.m2r.bbpix.BBPixFactory;
import com.m2r.bbpix.dto.ArrecadacaoPostRequest;
import com.m2r.bbpix.dto.ArrecadacaoPostResponse;
import com.m2r.bbpix.ennumeration.AmbienteEnum;

import java.math.BigDecimal;

public class GeracaoMain {

    public static void main(String[] args) {
        BBPixFactory factory = BBPixFactory.builder()
                .ambiente(AmbienteEnum.HOMOLOGACAO)
                .clientId(Const.CLIENT_ID)
                .clientSecret(Const.CLIENT_SECRET)
                .build();

        BBPix pix = factory.create();

        ArrecadacaoPostRequest payload = ArrecadacaoPostRequest.builder()
                .numeroConvenio(Const.NUMERO_CONVENIO)
                .codigoSolicitacaoBancoCentralBrasil(Const.CODIGO_SOLICITACAO_BANCO_CENTRAL)
                .emailDevedor("contato@bb.com.br")
                .descricaoSolicitacaoPagamento("teste")
                .valorOriginalSolicitacao(new BigDecimal("10.00"))
                .dataVencimentoSolicitacao("20.03.2021")
                .build();

        ArrecadacaoPostResponse result = pix.gerarPixArrecadacao(payload);

        System.out.println("Código de conciliação: " + result.getCodigoConciliacaoSolicitante());
        System.out.println("QRCode: " + result.getQrCode());
    }

}
