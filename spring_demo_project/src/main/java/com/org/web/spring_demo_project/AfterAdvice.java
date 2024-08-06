package com.org.web.spring_demo_project;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class AfterAdvice {
	@After("execution(* com.org.web.spring_demo_project.*.add(..))")
	public void allDaoAddMethods(JoinPoint joinPoint) {
		System.out.println("Intercepted method(After): " + joinPoint);
		System.out.println("Arguments(After): " + joinPoint.getArgs());
		System.out.println(joinPoint.getTarget());
	}
	//
	@After("execution(* com.org.web.spring_demo_project.*.*(..))")
	public void allDaoAddAnyMethods(JoinPoint joinPoint) {
		System.out.println("Intercepted method(After)1: " + joinPoint);
		System.out.println("Arguments(After)1: " + joinPoint.getArgs());
		System.out.println(joinPoint.getTarget());
	}
}
