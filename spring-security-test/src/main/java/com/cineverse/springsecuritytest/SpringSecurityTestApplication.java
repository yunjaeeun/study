package com.cineverse.springsecuritytest;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringSecurityTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityTestApplication.class, args);
	}


	/* ModelMapper 빈 등록(필요하면 의존성 주입, 라이브러리 추가 필수) */
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}
