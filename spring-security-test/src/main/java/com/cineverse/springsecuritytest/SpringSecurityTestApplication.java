package com.cineverse.springsecuritytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringSecurityTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityTestApplication.class, args);
	}

}
