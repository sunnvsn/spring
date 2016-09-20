package com.demo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.demo.dao.UserDao;
import com.demo.model.User;

@Component("userService")
public class UserService {
	
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	@Resource(name="userDao")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void add(User u){
		this.userDao.saveUser(u);
	}
}
