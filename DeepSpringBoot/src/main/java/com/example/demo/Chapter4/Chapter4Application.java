package com.example.demo.Chapter4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.Chapter4.aop.MyAspect;

@SpringBootApplication
public class Chapter4Application {
	
//	@Bean(name="myAspect")
//	public MyAspect initMyAspect() {
//		return new MyAspect();
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(Chapter4Application.class, args);
	}
}
