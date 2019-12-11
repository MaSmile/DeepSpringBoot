package com.example.demo.chapter6.dao;

import org.springframework.stereotype.Repository;

import com.example.demo.chapter6.pojo.User;

@Repository
public interface UserDao {
	public User getUser(Long id);
	public int insertUser(User user);
}
