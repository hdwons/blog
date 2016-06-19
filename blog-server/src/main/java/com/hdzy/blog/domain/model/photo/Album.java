package com.hdzy.blog.domain.model.photo;

import java.time.LocalDateTime;

/**
 * Created by donghe on 16/6/17.
 */
public class Album {
	private int id;
	private String name;
	private Photo cover;
	private String description;
	private LocalDateTime gmtCreate;

	public int getId () {
		return id;
	}

	public void setId (int id) {
		this.id = id;
	}

	public String getName () {
		return name;
	}

	public void setName (String name) {
		this.name = name;
	}

	public Photo getCover () {
		return cover;
	}

	public void setCover (Photo cover) {
		this.cover = cover;
	}

	public String getDescription () {
		return description;
	}

	public void setDescription (String description) {
		this.description = description;
	}

	public LocalDateTime getGmtCreate () {
		return gmtCreate;
	}

	public void setGmtCreate (LocalDateTime gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
}
