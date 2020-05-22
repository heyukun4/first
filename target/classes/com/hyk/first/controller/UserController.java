package com.hyk.first.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.hyk.first.pojo.User;
import com.hyk.first.service.UserService;

@Controller("userController")
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping("query")
	public String listShow(Model model) {
		System.out.println(userService.queryAllUser());
		model.addAttribute("users", userService.queryAllUser());

		return "query";
	}

	@PostMapping("insertUser")
	public String insertUser(@ModelAttribute User user) {
		userService.insertUser(user);
		return "redirect:/query";
	}
}
