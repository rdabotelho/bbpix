package com.m2r.bbpix.example;

import com.m2r.bbpix.BBPix;
import com.m2r.bbpix.BBPixFactory;
import com.m2r.bbpix.dto.ArrecadacaoGetResponse;
import com.m2r.bbpix.dto.ArrecadacaoPostRequest;
import com.m2r.bbpix.dto.ArrecadacaoPostResponse;
import com.m2r.bbpix.ennumeration.AmbienteEnum;

import java.math.BigDecimal;

public class ConsultaMain {

    public static void main(String[] args) {
        BBPixFactory factory = BBPixFactory.builder()
                .ambiente(AmbienteEnum.HOMOLOGACAO)
                .clientId(Const.CLIENT_ID)
                .clientSecret(Const.CLIENT_SECRET)
                .build();

        BBPix pix = factory.create();

        Integer numeroConvenio = Const.NUMERO_CONVENIO;
        String codigoConciliacaoSolicitante = "8XUeAEZlWeYaYv0x0trfWw6a6KDLvZyI5xh";
        ArrecadacaoGetResponse result = pix.obterPixArrecadacao(numeroConvenio, codigoConciliacaoSolicitante);

        System.out.println("Código de conciliação: " + codigoConciliacaoSolicitante);
        System.out.println("QRCode: " + result.getQrCode());
        System.out.println("Situação: " + result.getEstadoSolicitacao());
        System.out.println("Valor Pago: " + result.getValorPagamento());
    }

}
