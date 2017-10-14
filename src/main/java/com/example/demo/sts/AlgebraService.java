package com.example.demo.sts;

import org.springframework.stereotype.Component;

@Component
public class AlgebraService {

	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
}
