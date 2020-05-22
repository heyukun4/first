package com.hyk.first.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.hyk.first.pojo.User;

@Component
public interface UserDao {
	List<User> queryAllUser();
	
	void insertUser(User user);
}
