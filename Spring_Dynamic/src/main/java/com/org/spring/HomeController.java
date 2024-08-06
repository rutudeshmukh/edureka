package com.org.spring;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@RequestMapping(value = "/",method= RequestMethod.Get)
	public String hello() {
		return "home";
		
	}
}
