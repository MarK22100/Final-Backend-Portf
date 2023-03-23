package com.portfolio.mgb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.portfolio.mgb")
@EnableJpaRepositories
public class MgbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MgbApplication.class, args);
	}
}
