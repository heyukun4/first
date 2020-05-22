package com.hyk.first.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.hyk.first.dao.UserDao;
import com.hyk.first.pojo.User;
import com.hyk.first.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	public List<User> queryAllUser() {
		return userDao.queryAllUser();
	}
	public void insertUser(User user) {
		
		 userDao.insertUser(user);
	}
}
