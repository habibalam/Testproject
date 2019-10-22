package com.app.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.app.dao.IUserDao;

@Service
public class UserDetailsServiceImpl
implements UserDetailsService
{
	@Autowired
	private IUserDao dao;

	@Override
	public UserDetails loadUserByUsername(String username) 
			throws UsernameNotFoundException {
		//1. Load Model class User
		com.app.model.User user=dao.getOneUser(username);	
		//2. Set<GA> using SGA
		Set<GrantedAuthority> auths=new HashSet<>();
		for(String role:user.getRoles()) {
			auths.add(new SimpleGrantedAuthority(role));
		}
		
		//3. Return Spring F/w User
		return new User(username, user.getUserPwd(), auths);
	}
}






