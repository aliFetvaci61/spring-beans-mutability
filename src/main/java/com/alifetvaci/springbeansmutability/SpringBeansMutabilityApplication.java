package com.alifetvaci.springbeansmutability;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBeansMutabilityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBeansMutabilityApplication.class, args);
	}

}
