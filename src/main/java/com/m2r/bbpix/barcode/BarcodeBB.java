package com.m2r.bbpix.barcode;

import com.m2r.bbpix.ennumeration.SegmentoEnum;

import java.util.Date;

public class BarcodeBB extends BarcodeBase {

    private SegmentoEnum idSeguimento = SegmentoEnum.PREFEITURAS;
    private Integer valor = 0;
    private Date dataVencimento;
    private Integer campoLivre = 0;

    private BarcodeBB() {
    }

    @Override
    protected SegmentoEnum getIdSeguimento() {
        return this.idSeguimento;
    }

    @Override
    protected Integer getValor() {
        return this.valor;
    }

    @Override
    protected Date getDataVencimento() {
        return this.dataVencimento;
    }

    @Override
    protected Integer getCampoLivre() {
        return this.campoLivre;
    }

    public static BarcodeBBBuilder builder() {
        return new BarcodeBBBuilder();
    }

    public static class BarcodeBBBuilder {
        private BarcodeBB barcode;
        private BarcodeBBBuilder() {
            barcode = new BarcodeBB();
        }
        public BarcodeBBBuilder idSeguimento(SegmentoEnum value) {
            barcode.idSeguimento = value;
            return this;
        }
        public BarcodeBBBuilder valor(Integer value) {
            barcode.valor = value;
            return this;
        }
        public BarcodeBBBuilder dataVencimento(Date value) {
            barcode.dataVencimento = value;
            return this;
        }
        public BarcodeBBBuilder campoLivre(Integer value) {
            barcode.campoLivre = value;
            return this;
        }
        public BarcodeBase build() {
            return barcode;
        }
    }

}
