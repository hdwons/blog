package com.hdzy.blog.domain.repository.impl;

import com.hdzy.blog.domain.model.enums.OrderField;
import com.hdzy.blog.domain.model.enums.OrderRule;
import com.hdzy.blog.domain.repository.ArticleRepository;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by donghe on 16/6/7.
 */
public class ArticleRepositoryImplTest {

	private ArticleRepository articleRepository;

	@Before
	public void setUp () throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		articleRepository = (ArticleRepository) context.getBean("articleRepository");
	}

	@Test
	public void loadArticlesMeta () throws Exception {
		System.out.println(articleRepository.loadArticlesMeta(3, OrderField.GMT_CREATE, OrderRule.DESC));
	}

	@Test
	public void loadArticleById () throws Exception {

	}

}