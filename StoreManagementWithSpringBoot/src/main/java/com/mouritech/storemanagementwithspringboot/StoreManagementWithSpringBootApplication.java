package com.mouritech.storemanagementwithspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class StoreManagementWithSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreManagementWithSpringBootApplication.class, args);
	}

}
