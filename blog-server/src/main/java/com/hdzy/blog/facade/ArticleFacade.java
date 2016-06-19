package com.hdzy.blog.facade;

import com.hdzy.blog.domain.model.article.Article;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by donghe on 16/6/19.
 */
@RestController
@RequestMapping("/article")
public class ArticleFacade {

	@RequestMapping (value = "/{id}")
	@ResponseBody
	public Article getArticleById(@PathVariable int id){
		Article article = new Article();
		article.setId(id);
		article.setTitle("title");

		return article;
	}
}
