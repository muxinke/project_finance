package com.finance.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerServer10023Application {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerServer10023Application.class, args);
	}

}
