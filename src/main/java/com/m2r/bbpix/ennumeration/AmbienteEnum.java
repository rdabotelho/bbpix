package com.m2r.bbpix.ennumeration;

public enum AmbienteEnum {

    DESENVOLVIMENTO("dev", "https://oauth.desenv.bb.com.br", "https://api.desenv.bb.com.br","gw-app-key"),
    HOMOLOGACAO("hmg", "https://oauth.hm.bb.com.br", "https://api.hm.bb.com.br","gw-app-key"),
    PRODUCAO("prd", "https://oauth.bb.com.br", "https://api.bb.com.br","gw-dev-app-key");

    private String id;
    private String authUrl;
    private String url;
    private String appKeyName;

    AmbienteEnum(String id, String authUrl, String url, String appKeyName) {
        this.id = id;
        this.authUrl = authUrl;
        this.url = url;
        this.appKeyName = appKeyName;
    }

    public String getId() {
        return id;
    }

    public String getAuthUrl() {
        return authUrl;
    }

    public String getUrl() {
        return url;
    }

    public String getAppKeyName() {
        return appKeyName;
    }

}
