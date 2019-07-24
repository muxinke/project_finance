package com.finance.www.login_server_10031;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author DYF
 */
@EnableEurekaClient
@SpringBootApplication
public class LoginServer10031Application {

    public static void main(String[] args) {
        SpringApplication.run(LoginServer10031Application.class, args);
    }

}
