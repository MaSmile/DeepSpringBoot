package com.example.demo.Chapter4.aop.controller;

import static org.hamcrest.CoreMatchers.nullValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Chapter3.pojo.User;
import com.example.demo.Chapter4.aop.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService = null;
	
	@RequestMapping("/print")
	@ResponseBody
	public User printUser(Long id, String userName, String note) {
		User user = new User();
		user.setId(id);
		user.setUserName(userName);
		user.setNote(note);
		userService.printUser(user);
		return user;
	}
}
