package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.User;
import com.app.service.IUserService;

@Controller
public class UserController {
	@Autowired
	private IUserService service;
	
	//1. show Register page
	@RequestMapping("/register")
	public String showReg() {
		return "UserRegister";
	}
	//2. save data
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveUser(
			@ModelAttribute User user,
			ModelMap map
			)
	{
		
		Integer id=service.saveUser(user);
		String message="saved with id:"+id;
		map.addAttribute("msg",message);
		return "UserRegister";
	}
	//GET - /login => UserLogin.jsp
	@RequestMapping("/login")
	public String showLogin() {
		return "UserLogin";
	}
	
	
	
}





