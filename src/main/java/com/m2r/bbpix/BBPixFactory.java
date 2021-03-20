package com.m2r.bbpix;

import com.m2r.bbpix.ennumeration.AmbienteEnum;

public class BBPixFactory {

    private AmbienteEnum ambiente;
    private String clientId;
    private String clientSecret;

    private BBPixFactory() {
    }
    
    public BBPix create() {
        return new BBPix(this);
    }

    public AmbienteEnum getAmbiente() {
        return ambiente;
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public static BBPixFactoryBuilder builder() {
        return new BBPixFactoryBuilder();
    }

    public static class BBPixFactoryBuilder {
        private BBPixFactory factory;
        private BBPixFactoryBuilder() {
            this.factory = new BBPixFactory();
        }
        public BBPixFactoryBuilder ambiente(AmbienteEnum value) {
            this.factory.ambiente = value;
            return this;
        }
        public BBPixFactoryBuilder clientId(String value) {
            this.factory.clientId = value;
            return this;
        }
        public BBPixFactoryBuilder clientSecret(String value) {
            this.factory.clientSecret = value;
            return this;
        }
        public BBPixFactory build() {
            if (this.factory.ambiente == null) throw new RuntimeException("Ambiente não definido");
            if (this.factory.clientId == null) throw new RuntimeException("ClientId não definido");
            if (this.factory.clientSecret == null) throw new RuntimeException("ClientSecret não definido");
            return this.factory;
        }
    }

}
