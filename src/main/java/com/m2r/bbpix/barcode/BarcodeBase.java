package com.m2r.bbpix.barcode;

import com.m2r.bbpix.ennumeration.SegmentoEnum;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class BarcodeBase {

    static SimpleDateFormat SDF = new SimpleDateFormat("yyyyMMdd");

    static String ID_PRODUTO = "8";
    static String ID_VALOR_REAL = "6";
    static String ID_EMPRESA = "3137";

    protected String getIdProduto() {
        return ID_PRODUTO;
    }

    protected abstract SegmentoEnum getIdSeguimento();

    protected String getIdValorReal() {
        return ID_VALOR_REAL;
    }

    protected abstract Integer getValor();

    protected String getIdEmpresa() {
        return ID_EMPRESA;
    }

    protected abstract Date getDataVencimento();

    protected abstract Integer getCampoLivre();

    public String gerar() {
        String idProduto = getIdProduto();
        SegmentoEnum idSeguimento = getIdSeguimento();
        String idValorReal = getIdValorReal();
        Integer valor = getValor();
        String idEmpresa = getIdEmpresa();
        Date dataVencimento = getDataVencimento();
        Integer campoLivre = getCampoLivre();
        String code = String.format("%1s%01d%1s%011d%4s%8s%017d",
                    (idProduto != null ? idProduto : ""),
                    (idSeguimento != null ? idSeguimento.getCodigo() : 0),
                    (idValorReal != null ? idValorReal : ""),
                    (valor != null ? valor : 0),
                    (idEmpresa != null ? idEmpresa : "0000"),
                    (dataVencimento != null ? SDF.format(dataVencimento) : "00000000"),
                    (campoLivre != null ? campoLivre : 0)
                );
        return code.substring(0, 3) + modulo10(code) + code.substring(3);
    }

    public String modulo10(String str) {
        int mult = 2;
        int sum = 0;
        for (int i = (str.length() - 1); i >= 0; i--) {
            char c = str.charAt(i);
            int res = Integer.parseInt(c+"") * mult;
            sum += res > 9 ? (res - 10) + 1 : res;
            mult = mult == 2 ? 1 : 2;
        }
        int diferenca = 10 - (sum % 10);
        return (diferenca % 10) + "";
    }

}
