package com.hdzy.blog.domain.repository;

import com.hdzy.blog.domain.model.Article;

import java.util.List;

/**
 * Created by donghe on 16/6/4.
 */
public interface ArticleRepository {

	List<Article> loadArticlesMetaByCreateTimeDesc(int count);

	List<Article> loadArticlesMetaByHeatDesc(int count);
}
