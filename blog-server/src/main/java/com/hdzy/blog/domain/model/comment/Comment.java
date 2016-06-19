package com.hdzy.blog.domain.model.comment;

import com.hdzy.blog.domain.model.user.User;

/**
 * Created by donghe on 16/6/5.
 */
public class Comment {
	private int id;
	private int targetId;
	private User commenter;
	private String content;
	private int likePoint;

	public int getId () {
		return id;
	}

	public void setId (int id) {
		this.id = id;
	}

	public int getTargetId () {
		return targetId;
	}

	public void setTargetId (int targetId) {
		this.targetId = targetId;
	}

	public User getCommenter () {
		return commenter;
	}

	public void setCommenter (User commenter) {
		this.commenter = commenter;
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
