package com.finance.www.oauth_server_8050;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@EnableEurekaClient
@EnableAuthorizationServer
@SpringBootApplication
//@EnableResourceServer
public class OauthServer8050Application {

    public static void main(String[] args) {
        SpringApplication.run(OauthServer8050Application.class, args);
    }

}
