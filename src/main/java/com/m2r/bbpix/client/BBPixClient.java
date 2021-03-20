package com.m2r.bbpix.client;

import com.m2r.bbpix.dto.ArrecadacaoPostRequest;
import com.m2r.bbpix.dto.ArrecadacaoGetResponse;
import com.m2r.bbpix.dto.ArrecadacaoPostResponse;
import com.m2r.bbpix.dto.TokenResponse;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface BBPixClient {

    @RequestLine("POST /oauth/token")
    @Headers({
            "authorization: Basic {access_token}",
            "content-type: application/x-www-form-urlencoded"
    })
    public TokenResponse token(@Param("access_token") String accessToken, @Param("grant_type") String grantType, @Param("scope") String scope);

    @RequestLine("POST /pix-bb/v1/arrecadacao-qrcodes?{app_key_name}={app_key_value}")
    @Headers({
            "authorization: Bearer {access_token}",
            "content-type: application/json"
    })
    public ArrecadacaoPostResponse postArrecadacaoPix(@Param("access_token") String accessToken, @Param("app_key_name") String appKeyName, @Param("app_key_value") String appKeyValue, ArrecadacaoPostRequest payload);

    @RequestLine("GET /pix-bb/v1/arrecadacao-qrcodes/{idTrs}?{app_key_name}={app_key_value}&numeroConvenio={convenio}")
    @Headers({
            "authorization: Bearer {access_token}",
            "content-type: application/json"
    })
    public ArrecadacaoGetResponse getArrecadacaoPix(@Param("access_token") String accessToken, @Param("app_key_name") String appKeyName, @Param("app_key_value") String appKeyValue, @Param("convenio") Integer numeroConvenio, @Param("idTrs") String idTrs);

}
