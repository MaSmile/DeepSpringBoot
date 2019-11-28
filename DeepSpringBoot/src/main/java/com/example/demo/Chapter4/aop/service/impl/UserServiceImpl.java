package com.example.demo.Chapter4.aop.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.Chapter3.pojo.User;
import com.example.demo.Chapter4.aop.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public void printUser(User user) {
		// TODO Auto-generated method stub
		if (null == user) {
			throw new RuntimeException("参数为空。。。。。");
		}
		System.out.println("[id: " + user.getId() + ", username: " + user.getUserName() + ", note: " + user.getNote() + "]");
	}
}
