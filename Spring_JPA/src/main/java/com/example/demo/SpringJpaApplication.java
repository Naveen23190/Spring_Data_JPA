package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.spring", "com.example.demo"})
@EnableJpaRepositories(basePackages = "com.spring.repository")
@EntityScan(basePackages = "com.spring.entity")
public class SpringJpaApplication 
{
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

}
