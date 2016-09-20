package com.demo.service;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.demo.model.User;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		UserService service = (UserService)applicationContext.getBean("userService");
		User u = new User();
		service.add(u);
	}
	


}
