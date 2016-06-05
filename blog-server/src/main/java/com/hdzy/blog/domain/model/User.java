package com.hdzy.blog.domain.model;

import com.hdzy.blog.domain.model.enums.Role;

/**
 * Created by donghe on 16/6/5.
 */
public class User {
	private int id;
	private String name;
	private String email;
	private String password;
	private String photo;
	private Role role;

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

	public String getEmail () {
		return email;
	}

	public void setEmail (String email) {
		this.email = email;
	}

	public String getPassword () {
		return password;
	}

	public void setPassword (String password) {
		this.password = password;
	}

	public String getPhoto () {
		return photo;
	}

	public void setPhoto (String photo) {
		this.photo = photo;
	}

	public Role getRole () {
		return role;
	}

	public void setRole (Role role) {
		this.role = role;
	}

	@Override
	public String toString () {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", photo='" + photo + '\'' +
				", role=" + role +
				'}';
	}
}
