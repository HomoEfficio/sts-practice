package com.example.demo.sts;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StsPracticeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		System.out.println("Before Run Spring Boot Application");
		SpringApplication.run(StsPracticeApplication.class, args);
		System.out.println("After Run Spring Boot Application");
	}

	@Override
	public void run(String... args) throws Exception {
		Thread.sleep(500);
		System.out.println("Hello Spring Boot Command Line Runner!");
	}
}
