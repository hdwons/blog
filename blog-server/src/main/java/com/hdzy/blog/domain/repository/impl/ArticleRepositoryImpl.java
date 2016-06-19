package com.hdzy.blog.domain.repository.impl;

import com.hdzy.blog.common.dao.ArticleDao;
import com.hdzy.blog.domain.model.article.Article;
import com.hdzy.blog.domain.model.enums.OrderField;
import com.hdzy.blog.domain.model.enums.OrderRule;
import com.hdzy.blog.domain.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by donghe on 16/6/4.
 */
@Repository("articleRepository")
public class ArticleRepositoryImpl implements ArticleRepository {

	@Autowired
	private ArticleDao articleDao;

	public List<Article> loadArticlesMeta (int count, OrderField orderField, OrderRule orderRule) {
		return articleDao.selectArticlesMeta(count,orderField,orderRule);
	}

	public Article loadArticleById (int id) {
		return articleDao.selectArticleById(id);
	}
}
