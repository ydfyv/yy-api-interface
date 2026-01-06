package com.yy.yyapiinterface.api;

public interface InnerUserService {

    /**
     * 判断是否可访问, 用同样的加密算法加密，比较是否和signed相同
     * @param accessKey ak
     * @param  body 请求体
     * @param signed 签名
     * @return true/false
     */
    boolean isAccessible(String accessKey, String body, String signed);
}
