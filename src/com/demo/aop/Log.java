package com.demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {
	//@Before("execution(public * *(..))")
	//@Before("execution(public void com.demo.impl.UserDaoImpl.saveUser(com.demo.model.User))")
	public void before(){
		System.out.println("method start");
	}
}
