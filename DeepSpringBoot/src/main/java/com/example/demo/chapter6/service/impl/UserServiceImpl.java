package com.example.demo.chapter6.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.chapter6.dao.UserDao;
import com.example.demo.chapter6.pojo.User;
import com.example.demo.chapter6.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao = null;

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED, timeout = 1)
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return userDao.getUser(id);
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED, timeout = 1)
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return userDao.insertUser(user);
	}
}
