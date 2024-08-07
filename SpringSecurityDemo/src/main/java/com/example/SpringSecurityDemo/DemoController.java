package com.example.SpringSecurityDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/call")
	public String hello() {
		return "Spring Boot";
		
	}
}
