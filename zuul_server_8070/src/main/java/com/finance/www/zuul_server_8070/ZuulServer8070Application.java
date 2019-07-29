package com.finance.www.zuul_server_8070;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@EnableDiscoveryClient
@SpringBootApplication
@EnableZuulProxy
@EnableOAuth2Sso
public class ZuulServer8070Application {

    public static void main(String[] args) {
        SpringApplication.run(ZuulServer8070Application.class, args);
    }

}
