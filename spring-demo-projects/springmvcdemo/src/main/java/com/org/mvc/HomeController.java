package com.org.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public String homePage() {
		System.out.println("[HomeController] serving the request at / ");
		return "home";
	}
	
	@RequestMapping("/hello")
	public String name() {
		System.out.println("Hello");
		return "hello";
	}

}
