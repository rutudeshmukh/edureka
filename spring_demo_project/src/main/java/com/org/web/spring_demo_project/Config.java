package com.org.web.spring_demo_project;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages="com.org.web.spring_demo_project")
@EnableAspectJAutoProxy

public class Config {
	
}
