package com.hdzy.blog.facade;

import com.google.common.collect.Lists;
import com.hdzy.blog.domain.model.Article;
import java.util.List;

/**
 * Created by donghe on 16/5/12.
 */

public class ArticleFacade {

    public List<Article> getNewestArticles() {
		return Lists.newArrayList();
	}


	public List<Article> getHotestArticles(){
		return Lists.newArrayList();
	}

}
