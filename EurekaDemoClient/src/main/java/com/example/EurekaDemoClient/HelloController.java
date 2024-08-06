package com.example.EurekaDemoClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/get")
	public HelloService retriveLimit() {
		return new HelloService(5000,50);
		
	}
}
