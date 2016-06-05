package com.hdzy.blog.common.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by donghe on 16/6/5.
 */
public class UserDaoTest {

	private UserDao userDao;

	@Before
	public void setUp () throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		userDao = (UserDao) context.getBean("userDao");
	}

	@Test
	public void findUserById () throws Exception {
		System.out.println(userDao.findUserById(1));
	}

}