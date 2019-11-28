package com.example.demo.chapter5.dao;

import org.springframework.stereotype.Repository;

import com.example.demo.chapter5.pojo.User;

@Repository
public interface MyBatisUserDao {
	public User getUser(Long id);
}
