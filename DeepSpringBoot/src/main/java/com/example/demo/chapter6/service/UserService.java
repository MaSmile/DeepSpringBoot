package com.example.demo.chapter6.service;

import com.example.demo.chapter6.pojo.User;

public interface UserService {
	public User getUser(Long id);
	public int insertUser(User user);
}
