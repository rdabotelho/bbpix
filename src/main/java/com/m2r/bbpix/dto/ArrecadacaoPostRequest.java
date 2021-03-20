package com.m2r.bbpix.dto;

import java.math.BigDecimal;

public class ArrecadacaoPostRequest {

    public Integer numeroConvenio = 0;
    public String indicadorCodigoBarras = "S";
    public String codigoGuiaRecebimento;
    public String emailDevedor;
    public String codigoSolicitacaoBancoCentralBrasil;
    public String descricaoSolicitacaoPagamento = "";
    public BigDecimal valorOriginalSolicitacao = BigDecimal.ZERO;
    public BigDecimal valorDescontoSolicitacao = BigDecimal.ZERO;
    public BigDecimal valorJurosSolicitacao = BigDecimal.ZERO;
    public BigDecimal valorMultaSolicitacao = BigDecimal.ZERO;
    public String dataVencimentoSolicitacao;

    public Integer getNumeroConvenio() {
        return numeroConvenio;
    }

    public void setNumeroConvenio(Integer numeroConvenio) {
        this.numeroConvenio = numeroConvenio;
    }

    public String getIndicadorCodigoBarras() {
        return indicadorCodigoBarras;
    }

    public void setIndicadorCodigoBarras(String indicadorCodigoBarras) {
        this.indicadorCodigoBarras = indicadorCodigoBarras;
    }

    public String getCodigoGuiaRecebimento() {
        return codigoGuiaRecebimento;
    }

    public void setCodigoGuiaRecebimento(String codigoGuiaRecebimento) {
        this.codigoGuiaRecebimento = codigoGuiaRecebimento;
    }

    public String getEmailDevedor() {
        return emailDevedor;
    }

    public void setEmailDevedor(String emailDevedor) {
        this.emailDevedor = emailDevedor;
    }

    public String getCodigoSolicitacaoBancoCentralBrasil() {
        return codigoSolicitacaoBancoCentralBrasil;
    }

    public void setCodigoSolicitacaoBancoCentralBrasil(String codigoSolicitacaoBancoCentralBrasil) {
        this.codigoSolicitacaoBancoCentralBrasil = codigoSolicitacaoBancoCentralBrasil;
    }

    public String getDescricaoSolicitacaoPagamento() {
        return descricaoSolicitacaoPagamento;
    }

    public void setDescricaoSolicitacaoPagamento(String descricaoSolicitacaoPagamento) {
        this.descricaoSolicitacaoPagamento = descricaoSolicitacaoPagamento;
    }

    public BigDecimal getValorOriginalSolicitacao() {
        return valorOriginalSolicitacao;
    }

    public void setValorOriginalSolicitacao(BigDecimal valorOriginalSolicitacao) {
        this.valorOriginalSolicitacao = valorOriginalSolicitacao;
    }

    public BigDecimal getValorDescontoSolicitacao() {
        return valorDescontoSolicitacao;
    }

    public void setValorDescontoSolicitacao(BigDecimal valorDescontoSolicitacao) {
        this.valorDescontoSolicitacao = valorDescontoSolicitacao;
    }

    public BigDecimal getValorJurosSolicitacao() {
        return valorJurosSolicitacao;
    }

    public void setValorJurosSolicitacao(BigDecimal valorJurosSolicitacao) {
        this.valorJurosSolicitacao = valorJurosSolicitacao;
    }

    public BigDecimal getValorMultaSolicitacao() {
        return valorMultaSolicitacao;
    }

    public void setValorMultaSolicitacao(BigDecimal valorMultaSolicitacao) {
        this.valorMultaSolicitacao = valorMultaSolicitacao;
    }

    public String getDataVencimentoSolicitacao() {
        return dataVencimentoSolicitacao;
    }

    public void setDataVencimentoSolicitacao(String dataVencimentoSolicitacao) {
        this.dataVencimentoSolicitacao = dataVencimentoSolicitacao;
    }

    public static GerarQrCodeBodyBuilder builder() {
        return new GerarQrCodeBodyBuilder();
    }

    public static class GerarQrCodeBodyBuilder {
        private ArrecadacaoPostRequest body;
        private GerarQrCodeBodyBuilder() {
            body = new ArrecadacaoPostRequest();
        }
        public GerarQrCodeBodyBuilder numeroConvenio(Integer value) {
            body.setNumeroConvenio(value);
            return this;
        }
        public GerarQrCodeBodyBuilder emailDevedor(String value) {
            body.setEmailDevedor(value);
            return this;
        }
        public GerarQrCodeBodyBuilder codigoSolicitacaoBancoCentralBrasil(String value) {
            body.setCodigoSolicitacaoBancoCentralBrasil(value);
            return this;
        }
        public GerarQrCodeBodyBuilder descricaoSolicitacaoPagamento(String value) {
            body.setDescricaoSolicitacaoPagamento(value);
            return this;
        }
        public GerarQrCodeBodyBuilder valorOriginalSolicitacao(BigDecimal value) {
            body.setValorOriginalSolicitacao(value);
            return this;
        }
        public GerarQrCodeBodyBuilder valorDescontoSolicitacao(BigDecimal value) {
            body.setValorDescontoSolicitacao(value);
            return this;
        }
        public GerarQrCodeBodyBuilder valorJurosSolicitacao(BigDecimal value) {
            body.setValorJurosSolicitacao(value);
            return this;
        }
        public GerarQrCodeBodyBuilder valorMultaSolicitacao(BigDecimal value) {
            body.setValorMultaSolicitacao(value);
            return this;
        }
        public GerarQrCodeBodyBuilder dataVencimentoSolicitacao(String value) {
            body.setDataVencimentoSolicitacao(value);
            return this;
        }
        public ArrecadacaoPostRequest build() {
            return body;
        }
    }

}
