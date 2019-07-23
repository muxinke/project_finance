package com.finance.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServerRegister8080Application {

	public static void main(String[] args) {
		SpringApplication.run(ServerRegister8080Application.class, args);
	}

}
