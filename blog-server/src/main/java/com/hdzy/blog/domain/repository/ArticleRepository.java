package com.hdzy.blog.domain.repository;

import com.hdzy.blog.domain.model.article.Article;
import com.hdzy.blog.domain.model.enums.OrderField;
import com.hdzy.blog.domain.model.enums.OrderRule;

import java.util.List;

/**
 * Created by donghe on 16/6/4.
 */
public interface ArticleRepository {

	List<Article> loadArticlesMeta (int count, OrderField orderField, OrderRule orderRule);

	Article loadArticleById (int id);
}
