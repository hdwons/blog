package com.hdzy.blog.domain.service;

import com.hdzy.blog.domain.model.article.Article;

import java.util.List;

/**
 * Created by donghe on 16/6/3.
 */
public interface ArticleService {

	List<Article> getNewArticles (int num);

	List<Article> getHotArticles (int num);
}
