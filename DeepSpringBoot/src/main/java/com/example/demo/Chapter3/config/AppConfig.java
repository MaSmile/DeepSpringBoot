package com.example.demo.Chapter3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.Chapter3.pojo.User;

@Configuration
public class AppConfig {
	@Bean(name = "user")
	public User initUser() {
		User user = new User();
		user.setId(1L);
		user.setUserName("user_name_1");
		user.setNote("note_1");
		return user;
	}
}
