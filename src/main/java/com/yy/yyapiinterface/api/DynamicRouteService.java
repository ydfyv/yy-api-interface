package com.yy.yyapiinterface.api;

public interface DynamicRouteService {

    /**
     * 添加路由
     */
    void addRoute(String pathName);

    /**
     * 删除路由
     */
    void deleteRoute(String id);

    /**
     * 更新路由
     */
    void updateRoute(String id, String pathName);
}
