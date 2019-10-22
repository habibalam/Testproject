package com.app.dao;

import com.app.model.User;

public interface IUserDao {

	Integer saveUser(User user);
	User getOneUser(String email);
}






