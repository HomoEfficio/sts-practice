package com.example.demo.sts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

	private final AlgebraService algebraService;
	
	@Value("${service.algebra.add}")
	private String addLabel;
	
	@Autowired
	public MyCommandLineRunner(AlgebraService algebraService) {
		super();
		this.algebraService = algebraService;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("My Command Line Runner!!");
		int a = 3, b = 5;
		System.out.println(addLabel + ": " + a + ", " + b + " = " + this.algebraService.add(3,  5));
	}

}
