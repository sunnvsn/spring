package com.demo.impl;

import org.springframework.stereotype.Component;

import com.demo.dao.UserDao;
import com.demo.model.User;

@Component("userDao")
public class UserDaoImpl implements UserDao{

	@Override
	public void saveUser(User u) {
		System.out.println("a user saved!");		
	}	
}
