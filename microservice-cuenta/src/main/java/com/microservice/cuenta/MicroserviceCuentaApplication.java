package com.microservice.cuenta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceCuentaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCuentaApplication.class, args);
	}

}
