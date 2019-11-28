package com.example.demo.chapter5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.chapter5.pojo.User;
import com.example.demo.chapter5.service.MyBatisUserService;

@Controller
@RequestMapping("/mybatis")
public class MyBatisController {
	
	@Autowired
	private MyBatisUserService myBatisUserService = null;
	
	@RequestMapping("/getUser")
	@ResponseBody
	public User getUser(Long id) {
		return myBatisUserService.getUser(id);
	}
}
