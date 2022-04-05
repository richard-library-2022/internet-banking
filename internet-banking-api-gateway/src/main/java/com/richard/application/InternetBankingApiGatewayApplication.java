package com.richard.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class InternetBankingApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternetBankingApiGatewayApplication.class, args);
	}

}
