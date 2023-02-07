package com.in28minutes.springboot.learnspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "currency-service")
@Component
public class CurrencyServiceConfiguration {
    private String key;
    private String url;
    private String username;

    public void setKey(String key) {
        this.key = key;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getKey() {
        return key;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }
}
