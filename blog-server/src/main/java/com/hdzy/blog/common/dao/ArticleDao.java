package com.hdzy.blog.common.dao;

import com.hdzy.blog.domain.model.article.Article;
import com.hdzy.blog.domain.model.enums.OrderField;
import com.hdzy.blog.domain.model.enums.OrderRule;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by donghe on 16/6/6.
 */
public interface ArticleDao {

	List<Article> selectArticlesMeta (@Param ("count") int count,
									  @Param ("orderField") OrderField orderField,
									  @Param ("orderRule") OrderRule orderRule);

	Article selectArticleById (int id);
}
