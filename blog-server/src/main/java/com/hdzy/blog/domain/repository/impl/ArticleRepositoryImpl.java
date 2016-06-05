package com.hdzy.blog.domain.repository.impl;

import com.hdzy.blog.domain.model.Article;
import com.hdzy.blog.domain.repository.ArticleRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by donghe on 16/6/4.
 */
@Repository
public class ArticleRepositoryImpl implements ArticleRepository {

	public List<Article> loadArticlesMetaByCreateTimeDesc (int count) {
		return null;
	}

	public List<Article> loadArticlesMetaByHeatDesc (int count) {
		return null;
	}
}
