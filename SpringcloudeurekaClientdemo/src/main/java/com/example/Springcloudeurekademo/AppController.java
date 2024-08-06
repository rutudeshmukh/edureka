package com.example.Springcloudeurekademo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/app")
public class AppController{
	
	@GetMapping(path="/products")
	public Response getProduct() {
		Product p1= new Product("Apple iphone",70000);
		Product p2= new Product("Samsung LED TV",60000);
		Product p3= new Product("Hidrate water bottle",10000);
		Product p4= new Product("Apple watch",55000);
		Product p5= new Product("Apple Macbbook",120000);
		
		ArrayList<Product> p =new ArrayList<>();
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		Response response= new Response(101,"Products fetched successfully.",p);
	
	return response;
	}
}