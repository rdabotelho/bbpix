package com.m2r.bbpix.dto;

import java.math.BigDecimal;

public class ArrecadacaoGetResponse {

    private String codigoGuiaRecebimento;
    private String emailDevedor;
    private Integer codigoPaisTelefoneDevedor;
    private Integer dddTelefoneDevedor;
    private Integer numeroTelefoneDevedor;
    private String timestampCriacaoSolicitacao;
    private Integer quantidadeSegundoExpiracao;
    private String estadoSolicitacao;
    private Integer numeroVersaoSolicitacaoPagamento;
    private String linkQrCode;
    private String qrCode;
    private Integer cpfDevedor;
    private Integer cnpjDevedor;
    private String nomeDevedor;
    private BigDecimal valorOriginalSolicitacao;
    private String codigoSolicitacaoBancoCentralBrasil;
    private String descricaoSolicitacaoPagamento;
    private String codigoIdentificadorPagamento;
    private BigDecimal valorPagamento;
    private String timestampPagamento;
    private Long cpfPagador;
    private Long cnpjPagador;
    private String nomeClientePagador;
    private String textoInformativoPagador;

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

    public Integer getCodigoPaisTelefoneDevedor() {
        return codigoPaisTelefoneDevedor;
    }

    public void setCodigoPaisTelefoneDevedor(Integer codigoPaisTelefoneDevedor) {
        this.codigoPaisTelefoneDevedor = codigoPaisTelefoneDevedor;
    }

    public Integer getDddTelefoneDevedor() {
        return dddTelefoneDevedor;
    }

    public void setDddTelefoneDevedor(Integer dddTelefoneDevedor) {
        this.dddTelefoneDevedor = dddTelefoneDevedor;
    }

    public Integer getNumeroTelefoneDevedor() {
        return numeroTelefoneDevedor;
    }

    public void setNumeroTelefoneDevedor(Integer numeroTelefoneDevedor) {
        this.numeroTelefoneDevedor = numeroTelefoneDevedor;
    }

    public String getTimestampCriacaoSolicitacao() {
        return timestampCriacaoSolicitacao;
    }

    public void setTimestampCriacaoSolicitacao(String timestampCriacaoSolicitacao) {
        this.timestampCriacaoSolicitacao = timestampCriacaoSolicitacao;
    }

    public Integer getQuantidadeSegundoExpiracao() {
        return quantidadeSegundoExpiracao;
    }

    public void setQuantidadeSegundoExpiracao(Integer quantidadeSegundoExpiracao) {
        this.quantidadeSegundoExpiracao = quantidadeSegundoExpiracao;
    }

    public String getEstadoSolicitacao() {
        return estadoSolicitacao;
    }

    public void setEstadoSolicitacao(String estadoSolicitacao) {
        this.estadoSolicitacao = estadoSolicitacao;
    }

    public Integer getNumeroVersaoSolicitacaoPagamento() {
        return numeroVersaoSolicitacaoPagamento;
    }

    public void setNumeroVersaoSolicitacaoPagamento(Integer numeroVersaoSolicitacaoPagamento) {
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

    public Integer getCpfDevedor() {
        return cpfDevedor;
    }

    public void setCpfDevedor(Integer cpfDevedor) {
        this.cpfDevedor = cpfDevedor;
    }

    public Integer getCnpjDevedor() {
        return cnpjDevedor;
    }

    public void setCnpjDevedor(Integer cnpjDevedor) {
        this.cnpjDevedor = cnpjDevedor;
    }

    public String getNomeDevedor() {
        return nomeDevedor;
    }

    public void setNomeDevedor(String nomeDevedor) {
        this.nomeDevedor = nomeDevedor;
    }

    public BigDecimal getValorOriginalSolicitacao() {
        return valorOriginalSolicitacao;
    }

    public void setValorOriginalSolicitacao(BigDecimal valorOriginalSolicitacao) {
        this.valorOriginalSolicitacao = valorOriginalSolicitacao;
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

    public String getCodigoIdentificadorPagamento() {
        return codigoIdentificadorPagamento;
    }

    public void setCodigoIdentificadorPagamento(String codigoIdentificadorPagamento) {
        this.codigoIdentificadorPagamento = codigoIdentificadorPagamento;
    }

    public BigDecimal getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(BigDecimal valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public String getTimestampPagamento() {
        return timestampPagamento;
    }

    public void setTimestampPagamento(String timestampPagamento) {
        this.timestampPagamento = timestampPagamento;
    }

    public Long getCpfPagador() {
        return cpfPagador;
    }

    public void setCpfPagador(Long cpfPagador) {
        this.cpfPagador = cpfPagador;
    }

    public Long getCnpjPagador() {
        return cnpjPagador;
    }

    public void setCnpjPagador(Long cnpjPagador) {
        this.cnpjPagador = cnpjPagador;
    }

    public String getNomeClientePagador() {
        return nomeClientePagador;
    }

    public void setNomeClientePagador(String nomeClientePagador) {
        this.nomeClientePagador = nomeClientePagador;
    }

    public String getTextoInformativoPagador() {
        return textoInformativoPagador;
    }

    public void setTextoInformativoPagador(String textoInformativoPagador) {
        this.textoInformativoPagador = textoInformativoPagador;
    }

}
