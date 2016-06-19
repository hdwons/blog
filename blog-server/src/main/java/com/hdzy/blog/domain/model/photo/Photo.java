package com.hdzy.blog.domain.model.photo;

import java.time.LocalDateTime;

/**
 * Created by donghe on 16/6/18.
 */
public class Photo {
	private int id;
	private String name;
	private String description;
	private String path;
	private LocalDateTime gmtCreate;
	private int albumId;

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

	public String getDescription () {
		return description;
	}

	public void setDescription (String description) {
		this.description = description;
	}

	public String getPath () {
		return path;
	}

	public void setPath (String path) {
		this.path = path;
	}

	public LocalDateTime getGmtCreate () {
		return gmtCreate;
	}

	public void setGmtCreate (LocalDateTime gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public int getAlbumId () {
		return albumId;
	}

	public void setAlbumId (int albumId) {
		this.albumId = albumId;
	}
}