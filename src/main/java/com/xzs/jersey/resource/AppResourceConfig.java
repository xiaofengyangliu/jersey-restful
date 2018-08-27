package com.xzs.jersey.resource;


import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * REST接口配置
 */
public class AppResourceConfig extends ResourceConfig {
    /**
     * Register JAX-RS application components.
     */
    public AppResourceConfig() {

        // 屏蔽wadl接口展示
//         property(ServerProperties.WADL_FEATURE_DISABLE, true);

        // 1. 扫描组件
        packages("com.xzs.jersey");

        // 2. 注册Filter
        // 开启HTTP日志输出
        // register(LoggingFilter.class);

        // 注册Feature
        // 支持FormData
        register(MultiPartFeature.class);
        // 支持POJO-JSON binding
        register(JacksonFeature.class);
        // 支持POJO-XML binding
        register(JacksonJaxbJsonProvider.class);

    }
}
