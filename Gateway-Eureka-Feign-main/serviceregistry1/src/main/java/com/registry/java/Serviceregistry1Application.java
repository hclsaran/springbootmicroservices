package com.registry.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Serviceregistry1Application {

	public static void main(String[] args) {
		SpringApplication.run(Serviceregistry1Application.class, args);
	}

}
