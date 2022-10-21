package com.zensar.olx.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olx.bean.LoginResponse;
import com.zensar.olx.bean.LoginUser;
import com.zensar.olx.service.LoginServiceImpl;
import com.zensar.training.bean.LoginRequest;


@RestController
public class LoginUserController {

	@Autowired
	LoginServiceImpl loginServiceImpl;
	
	@PostMapping("/addUser")
   	public LoginUser add(@RequestBody LoginUser loginUser) 
   	{
   		
   		return this.loginServiceImpl.addLoginUser(loginUser);
   		
   	}	
		
   	@GetMapping("/findUser/{name}")
   	public LoginUser findLoginUserByName(@PathVariable String name) 
   	{
   		
   		return this.loginServiceImpl.findLoginUserByName(name);
   		
   	}
		
	
   	@PostMapping("/authenticate")
   	public LoginResponse createToken(@RequestBody LoginRequest loginRequest)
   	{
   		
   	UsernamePasswordAuthenticationToken authUserPass=new UsernamePasswordAuthenticationToken(loginRequest); 
   		
   	this.authenticationManager.authenticate(authUserPass);	
   		
   	
   	UserDetails userDetails;
   	userDetails=loginServiceImpl.loadUserByUsername(loginRequest.getUserName());
    String jwtstr=jwtUtil.generateToken(loginRequest.getUserName());
    
    return new LoginResponse(jwtstr);
    
     
   	}
   	
   	
   	 
}
