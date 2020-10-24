package com.mathew.example.demoexampleweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DemoExampleWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoExampleWebApplication.class, args);
	}

}
