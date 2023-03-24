package com.portfolio.mgb;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@SpringBootApplication
@EnableJpaRepositories
public class MgbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MgbApplication.class, args);
	}
           public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("/**/");
    }
}
