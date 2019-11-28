package com.example.demo.Chapter3.config;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.Chapter3.pojo.User;


public class IoCTest {
	private static Logger log = Logger.getLogger(IoCTest.class);
	public static void main(String[] args) {
		ApplicationContext ctxApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = ctxApplicationContext.getBean(User.class);
		log.info(user.getId());
	}
}
