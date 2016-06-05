package com.hdzy.blog.domain.model;

/**
 * Created by donghe on 16/6/5.
 */
public class Comment {
	private int id;
	private int articleId;
	private int reviewerId;
	private String content;
	private int likePoint;

	public int getId () {
		return id;
	}

	public void setId (int id) {
		this.id = id;
	}

	public int getArticleId () {
		return articleId;
	}

	public void setArticleId (int articleId) {
		this.articleId = articleId;
	}

	public int getReviewerId () {
		return reviewerId;
	}

	public void setReviewerId (int reviewerId) {
		this.reviewerId = reviewerId;
	}

	public String getContent () {
		return content;
	}

	public void setContent (String content) {
		this.content = content;
	}

	public int getLikePoint () {
		return likePoint;
	}

	public void setLikePoint (int likePoint) {
		this.likePoint = likePoint;
	}
}
