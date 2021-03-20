package com.m2r.bbpix.dto;

public class ArrecadacaoPostResponse {

    private String timestampCriacaoSolicitacao;
    private String estadoSolicitacao;
    private String codigoConciliacaoSolicitante;
    private String numeroVersaoSolicitacaoPagamento;
    private String linkQrCode;
    private String qrCode;

    public String getTimestampCriacaoSolicitacao() {
        return timestampCriacaoSolicitacao;
    }

    public void setTimestampCriacaoSolicitacao(String timestampCriacaoSolicitacao) {
        this.timestampCriacaoSolicitacao = timestampCriacaoSolicitacao;
    }

    public String getEstadoSolicitacao() {
        return estadoSolicitacao;
    }

    public void setEstadoSolicitacao(String estadoSolicitacao) {
        this.estadoSolicitacao = estadoSolicitacao;
    }

    public String getCodigoConciliacaoSolicitante() {
        return codigoConciliacaoSolicitante;
    }

    public void setCodigoConciliacaoSolicitante(String codigoConciliacaoSolicitante) {
        this.codigoConciliacaoSolicitante = codigoConciliacaoSolicitante;
    }

    public String getNumeroVersaoSolicitacaoPagamento() {
        return numeroVersaoSolicitacaoPagamento;
    }

    public void setNumeroVersaoSolicitacaoPagamento(String numeroVersaoSolicitacaoPagamento) {
        this.numeroVersaoSolicitacaoPagamento = numeroVersaoSolicitacaoPagamento;
    }

    public String getLinkQrCode() {
        return linkQrCode;
    }

    public void setLinkQrCode(String linkQrCode) {
        this.linkQrCode = linkQrCode;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

}
