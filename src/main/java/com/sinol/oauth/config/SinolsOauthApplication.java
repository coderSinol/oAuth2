package com.sinol.oauth.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.sinol")
@EnableJpaRepositories("com.sinol")
@ComponentScan("com.sinol")
public class SinolsOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SinolsOauthApplication.class, args);
	}

}

