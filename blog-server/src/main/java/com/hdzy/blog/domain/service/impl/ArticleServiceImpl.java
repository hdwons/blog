package com.hdzy.blog.domain.service.impl;

import com.hdzy.blog.domain.model.Article;
import com.hdzy.blog.domain.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by donghe on 16/6/4.
 */
@Service("articleService")
public class ArticleServiceImpl implements ArticleService {

	public List<Article> getNewArticles (int num) {
		return null;
	}

	public List<Article> getHotArticles (int num) {
		return null;
	}
}
