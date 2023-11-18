package com.devsuperior;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class ClassApplication{

	public static void main(String[] args) {
		SpringApplication.run(ClassApplication.class, args);
	}
}
