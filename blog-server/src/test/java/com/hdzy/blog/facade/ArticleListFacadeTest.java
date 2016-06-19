package com.hdzy.blog.facade;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by donghe on 16/6/7.
 */
public class ArticleListFacadeTest {

	private ArticleListFacade articleListFacade;

	@Before
	public void setUp () throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		articleListFacade = (ArticleListFacade) context.getBean("articleListFacade");
	}

	@Test
	public void getNewestArticles () throws Exception {
		System.out.println(articleListFacade.getNewestArticles());
	}

	@Test
	public void getHotestArticles () throws Exception {
		System.out.println(articleListFacade.getHotestArticles());
	}

}