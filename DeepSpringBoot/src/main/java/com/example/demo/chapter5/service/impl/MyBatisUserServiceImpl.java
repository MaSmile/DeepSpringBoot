package com.example.demo.chapter5.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.chapter5.dao.MyBatisUserDao;
import com.example.demo.chapter5.pojo.User;
import com.example.demo.chapter5.service.MyBatisUserService;

@Service
public class MyBatisUserServiceImpl implements MyBatisUserService {

	@Autowired
	private MyBatisUserDao myBatisUserDao = null;
	
	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return myBatisUserDao.getUser(id);
	}
	
}
