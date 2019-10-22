package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUserDao;
import com.app.model.User;
import com.app.service.IUserService;
@Service
// TxManagement + logics + calculation
public class UserServiceImpl 
	implements IUserService
{
	@Autowired
	private IUserDao dao;
	@Autowired
	private BCryptPasswordEncoder enc;

	@Transactional
	public Integer saveUser(User user) {
		String pwd=user.getUserPwd();
		pwd=enc.encode(pwd);
		user.setUserPwd(pwd);
		return dao.saveUser(user);
	}
	
	
	
	
	
}
