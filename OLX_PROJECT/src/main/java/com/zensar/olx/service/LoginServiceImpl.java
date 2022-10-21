package com.zensar.olx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.olx.bean.LoginUser;
import com.zensar.olx.db.LoginUserDAO;


@Service
public class LoginServiceImpl implements UserDetailsService {

	
	@Autowired
	LoginUserDAO loginUserDAO;
	
	public LoginUser addLoginUser(LoginUser loginUser) 
	{
		return this.loginUserDAO.save(loginUser);
		
		
	}
	
	
	public LoginUser findLoginUserByName(String name) 
	{
		
		return this.loginUserDAO.findByName(name);
		
	}
	
	
}
