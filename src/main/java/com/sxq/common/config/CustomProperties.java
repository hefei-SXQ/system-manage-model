package com.sxq.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Auther sun
 * @Date 2019/10/17 22:00
 * @Discription example
 */
@Configuration
@PropertySource("classpath:test.properties")
@ConfigurationProperties(prefix = "test")
@Component
public class CustomProperties {

    private String baseUrl;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }
}
