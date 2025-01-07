package com.project.uber.uberApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UberApplication {

	public static void main(String[] args) {
		System.out.println("starting application");
		SpringApplication.run(UberApplication.class, args);
	}

}
