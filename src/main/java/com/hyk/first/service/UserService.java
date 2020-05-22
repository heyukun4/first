package com.hyk.first.service;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.hyk.first.pojo.User;

public interface UserService {
	List<User> queryAllUser();

	void insertUser(User user);
}
