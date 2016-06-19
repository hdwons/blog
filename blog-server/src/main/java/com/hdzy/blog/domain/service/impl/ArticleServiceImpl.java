package com.hdzy.blog.domain.service.impl;

import com.hdzy.blog.domain.model.article.Article;
import com.hdzy.blog.domain.model.enums.OrderField;
import com.hdzy.blog.domain.model.enums.OrderRule;
import com.hdzy.blog.domain.repository.ArticleRepository;
import com.hdzy.blog.domain.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by donghe on 16/6/4.
 */
@Service ("articleService")
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleRepository articleRepository;

	public List<Article> getNewArticles (int num) {
		return articleRepository.loadArticlesMeta(num, OrderField.GMT_CREATE, OrderRule.DESC);
	}

	public List<Article> getHotArticles (int num) {
		return articleRepository.loadArticlesMeta(num, OrderField.HEAT, OrderRule.DESC);
	}
}
