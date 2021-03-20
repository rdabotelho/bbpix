package com.m2r.bbpix.ennumeration;

public enum AmbienteEnum {

    DESENVOLVIMENTO("dev", "https://oauth.desenv.bb.com.br", " https://api.desenv.bb.com.br","gw-app-key", "b82315c0c31e0135776b005056891bef"),
    HOMOLOGACAO("hmg", "https://oauth.hm.bb.com.br", "https://api.hm.bb.com.br","gw-app-key", "b82315c0c31e0135776b005056891bef"),
    PRODUCAO("prd", "https://oauth.bb.com.br", " https://api.bb.com.br","gw-dev-app-key", "b82315c0c31e0135776b005056891bef");

    private String id;
    private String authUrl;
    private String url;
    private String appKeyName;
    private String appKeyValue;

    AmbienteEnum(String id, String authUrl, String url, String appKeyName, String appKeyValue) {
        this.id = id;
        this.authUrl = authUrl;
        this.url = url;
        this.appKeyName = appKeyName;
        this.appKeyValue = appKeyValue;
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

    public String getAppKeyValue() {
        return appKeyValue;
    }

}
