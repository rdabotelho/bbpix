package com.m2r.bbpix.ennumeration;

public enum SegmentoEnum {

    PREFEITURAS(1),
    SANEAMENTO(2),
    ELÉTRICA_E_GAS(3),
    TELECOMUNICACOES(4),
    ORGAOS_GOVERNAMENTAIS(5),
    CARNES_E_ASSEMELHADOS_OU_DEMAIS(6),
    MULTAS_DE_TRANSITO(7),
    USO_EXCLUSIVO_DO_BANCO(8);

    private int codigo;

    SegmentoEnum(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

}
