package com.hdzy.blog.domain.model;

import java.util.Date;

/**
 * Created by donghe on 16/6/3.
 */
public class Article {
	private int id;
	private String title;
	private int authorId;
	private String description;
	private String content;
	private Date gmtCreate;
	private Date gmtModify;
	private int heat;

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

	public String getDescription () {
		return description;
	}

	public void setDescription (String description) {
		this.description = description;
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

	public int getHeat () {
		return heat;
	}

	public void setHeat (int heat) {
		this.heat = heat;
	}

	@Override
	public String toString () {
		return "Article{" +
				"id=" + id +
				", title='" + title + '\'' +
				", authorId=" + authorId +
				", description='" + description + '\'' +
				", content='" + content + '\'' +
				", gmtCreate=" + gmtCreate +
				", gmtModify=" + gmtModify +
				", heat=" + heat +
				'}';
	}
}
