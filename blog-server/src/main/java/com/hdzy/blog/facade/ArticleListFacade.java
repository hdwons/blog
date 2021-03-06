package com.hdzy.blog.facade;

import com.hdzy.blog.domain.model.article.Article;
import com.hdzy.blog.domain.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by donghe on 16/5/12.
 */
@RestController
@RequestMapping("/articles")
public class ArticleListFacade {

	@Autowired
	private ArticleService articleService;

	@RequestMapping(value = "/new",method = GET)
	@ResponseBody
    public List<Article> getNewestArticles() {
		return articleService.getNewArticles(4);
	}

	@RequestMapping(value = "/hot", method = GET)
	@ResponseBody
	public List<Article> getHotestArticles(){
		return articleService.getHotArticles(4);
	}
}
