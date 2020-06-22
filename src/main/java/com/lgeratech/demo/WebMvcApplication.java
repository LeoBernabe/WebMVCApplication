package com.lgeratech.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class WebMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebMvcApplication.class, args);
	}

}
