package com.hdzy.blog.domain.model.article;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by donghe on 16/6/3.
 */
public class Article {
	private int id;
	private String title;
	private String description;
	private String content;
	private Menu menu;
	private List<Label> labels = new ArrayList<>();
	private LocalDateTime gmtCreate;
	private LocalDateTime gmtModify;
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

	public LocalDateTime getGmtCreate () {
		return gmtCreate;
	}

	public void setGmtCreate (LocalDateTime gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public LocalDateTime getGmtModify () {
		return gmtModify;
	}

	public void setGmtModify (LocalDateTime gmtModify) {
		this.gmtModify = gmtModify;
	}

	public int getHeat () {
		return heat;
	}

	public void setHeat (int heat) {
		this.heat = heat;
	}

	public Menu getMenu () {
		return menu;
	}

	public void setMenu (Menu menu) {
		this.menu = menu;
	}

	public List<Label> getLabels () {
		return labels;
	}

	public void setLabels (List<Label> labels) {
		this.labels = labels;
	}

	@Override
	public String toString () {
		return "Article{" +
				"id=" + id +
				", title='" + title + '\'' +
				", description='" + description + '\'' +
				", content='" + content + '\'' +
				", menu=" + menu +
				", labels=" + labels +
				", gmtCreate=" + gmtCreate +
				", gmtModify=" + gmtModify +
				", heat=" + heat +
				'}';
	}
}
