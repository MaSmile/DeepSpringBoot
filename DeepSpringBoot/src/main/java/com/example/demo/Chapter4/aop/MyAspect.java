package com.example.demo.Chapter4.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	
	@Pointcut("execution(* com.example.demo.Chapter4.aop.service.impl.UserServiceImpl.printUser(..))")
	public void pointCut() {}
	
	@Before("pointCut()")
	public void before() {
		System.out.println("before......");
	}
	
	@After("pointCut()")
	public void after() {
		System.out.println("after......");
	}
	
	@AfterReturning("pointCut()")
	public void afterReturning() {
		System.out.println("afterReturning......");
	}
	
	@AfterThrowing("pointCut()")
	public void afterThrowing() {
		System.out.println("afterThrowing......");
	}
	
	@Around("pointCut()")
	public void around(ProceedingJoinPoint jPoint) throws Throwable {
		System.out.println("around before......");
		jPoint.proceed();
		System.out.println("around after......");
	}
} 
