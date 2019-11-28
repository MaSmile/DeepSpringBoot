package com.example.demo.chapter5;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@MapperScan(basePackages = "com.example.demo.chapter5.*",
			annotationClass = Repository.class)
public class Chapter5Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Chapter5Application.class, args);
	}
}
