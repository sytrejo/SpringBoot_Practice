package com.me.Practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
public class SpringBoot2WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2WebApplication.class, args);
	}

}
