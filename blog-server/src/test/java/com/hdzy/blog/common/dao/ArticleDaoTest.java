package com.hdzy.blog.common.dao;

import com.hdzy.blog.domain.model.enums.OrderField;
import com.hdzy.blog.domain.model.enums.OrderRule;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by donghe on 16/6/6.
 */
public class ArticleDaoTest {
	private ArticleDao articleDao;

	@Before
	public void setUp () throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		articleDao = (ArticleDao) context.getBean("articleDao");
	}

	@Test
	public void selectArticlesMeta () throws Exception {
		System.out.println(articleDao.selectArticlesMeta(3, OrderField.HEAT, OrderRule.DESC));
	}

	@Test
	public void selectArticleById () throws Exception {
		System.out.println(articleDao.selectArticleById(5));
	}

}