package com.hdzy.blog.common.dao;

import com.hdzy.blog.domain.model.user.User;

/**
 * Created by donghe on 16/6/5.
 */
public interface UserDao {
	User findUserById (int id);
}
