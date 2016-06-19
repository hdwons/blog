package com.hdzy.blog.domain.model.article;

import java.time.LocalDateTime;

/**
 * Created by donghe on 16/6/19.
 */
public class Menu {
	private int id;
	private String name;
	private LocalDateTime gmtCreate;
	private Menu parentMenu;

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

	public LocalDateTime getGmtCreate () {
		return gmtCreate;
	}

	public void setGmtCreate (LocalDateTime gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Menu getParentMenu () {
		return parentMenu;
	}

	public void setParentMenu (Menu parentMenu) {
		this.parentMenu = parentMenu;
	}
}
