package com.zensar.olx.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.zensar.olx.service.LoginServiceImpl;



@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdaptar {

	@Autowired
	LoginServiceImpl loginServiceImpl;
	
	@Autowired
	JwtRequestFilter jwtRequestFilter;
	
	
	protected void configure(AuthenticationManagerBuilder auth)throws Exception
	{
		
		
		
		auth.userDetailsService(LoginServiceImpl);
		
		
	}
	
	
	public passwordEncoder passwordEncoder() 
	{
		return NoOpPasswordEncoder.getInstance();
		
		
	}
	
	
	protected void configure(HttpSecurity http)throws Exception
	{
		http.csrf().disable()
		.authorizeRequests().antMatchers("/authenticate")
		.permitAll().anyRequest().authenticated()
		.and().sessionManagement()
		.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		
		
				
				
	}
	
	
	protected AuthenticationManager authenticationManager() throws Exception
	{
		
		return  super.authenticationManager();
		
	}
	
	
	
	
}
