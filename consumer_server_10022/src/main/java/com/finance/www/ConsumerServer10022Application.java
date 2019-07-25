package com.finance.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerServer10022Application {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerServer10022Application.class, args);
	}

}
