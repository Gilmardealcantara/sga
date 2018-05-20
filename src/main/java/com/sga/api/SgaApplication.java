package com.sga.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
 
@SpringBootApplication
@EnableJpaAuditing
public class SgaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SgaApplication.class, args);
	}
}
