package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(value = "/hi" , method = RequestMethod.GET)
	public String hello() {
		System.out.println(" I am helloController");
		return "index.jsp";
	}
}
