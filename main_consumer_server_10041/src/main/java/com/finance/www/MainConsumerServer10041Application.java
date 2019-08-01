package com.finance.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MainConsumerServer10041Application {

	public static void main(String[] args) {
		SpringApplication.run(MainConsumerServer10041Application.class, args);
	}

}
