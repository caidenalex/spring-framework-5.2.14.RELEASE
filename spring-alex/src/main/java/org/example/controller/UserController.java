package org.example.controller;

import org.example.dao.UserDao;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserController {

	@Autowired
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}
}
