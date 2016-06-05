package com.hdzy.blog.domain.model;

import java.util.Date;

/**
 * Created by donghe on 16/6/3.
 */
public class Article {
	private int id;
	private String title;
	private int authorId;
	private String desc;
	private String content;
	private Date gmtCreate;
	private Date gmtModify;
	private int likePoint;

	public int getId () {
		return id;
	}

	public void setId (int id) {
		this.id = id;
	}

	public String getTitle () {
		return title;
	}

	public void setTitle (String title) {
		this.title = title;
	}

	public int getAuthorId () {
		return authorId;
	}

	public void setAuthorId (int authorId) {
		this.authorId = authorId;
	}

	public String getDesc () {
		return desc;
	}

	public void setDesc (String desc) {
		this.desc = desc;
	}

	public String getContent () {
		return content;
	}

	public void setContent (String content) {
		this.content = content;
	}

	public Date getGmtCreate () {
		return gmtCreate;
	}

	public void setGmtCreate (Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModify () {
		return gmtModify;
	}

	public void setGmtModify (Date gmtModify) {
		this.gmtModify = gmtModify;
	}

	public int getLikePoint () {
		return likePoint;
	}

	public void setLikePoint (int likePoint) {
		this.likePoint = likePoint;
	}
}
