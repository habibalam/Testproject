package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IUserDao;
import com.app.model.User;
@Repository
public class UserDaoImpl 
	implements IUserDao
{
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveUser(User user) {
		return (Integer) ht.save(user);
	}
	
	@Override
	public User getOneUser(String email) {
		User user=null;
		String hql=" select u "
				+ " from com.app.model.User u "
				+ " where u.userEmail=?0 ";
		List<User> list=(List<User>) ht.find(hql, email);
		if(list!=null && !list.isEmpty()) {
			user=list.get(0);
		}
		return user;
	}
	
	

}




