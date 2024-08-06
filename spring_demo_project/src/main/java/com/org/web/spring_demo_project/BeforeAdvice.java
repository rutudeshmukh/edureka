package com.org.web.spring_demo_project;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class BeforeAdvice {
	// we can use join-point in advice method and using it get the method signature
	// or the target object, we can use args /arguments also in the point-cut to be
	// applied in any method that matches argument pattern. If we use this we need
	// to use the same name in advice method from where the argument type is
	// determine.
	
	@Before("execution(* com.org.web.spring_demo_project.*.add(..))")
	public void allDaoAddMethods(JoinPoint joinPoint) {
		System.out.println("Intercepted method(Before): " + joinPoint);
		System.out.println("Arguments(Before): " + joinPoint.getArgs());
		System.out.println(joinPoint.getTarget());
	}
	//
	@Before("execution(* com.org.web.spring_demo_project.*.*(..))")
	public void allDaoAddAnyMethods(JoinPoint joinPoint) {
		System.out.println("Intercepted method(Before)1: " + joinPoint);
		System.out.println("Arguments(Before)1: " + joinPoint.getArgs());
		System.out.println(joinPoint.getTarget());
	}
}
