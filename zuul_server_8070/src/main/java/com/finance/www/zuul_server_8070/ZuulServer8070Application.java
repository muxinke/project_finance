package com.finance.www.zuul_server_8070;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableEurekaClient
@EnableWebSecurity
@EnableAuthorizationServer
@SpringBootApplication
@EnableZuulProxy
//@EnableResourceServer
public class ZuulServer8070Application {

    public static void main(String[] args) {
        SpringApplication.run(ZuulServer8070Application.class, args);
    }

}
