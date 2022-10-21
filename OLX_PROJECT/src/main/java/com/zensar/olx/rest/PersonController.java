package com.zensar.olx.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class PersonController {

	@Autowired
	PersonService personService;
	
	
	public PersonService  getPersonService() 
	{
		
		return personService;
	 	
	}
	

	public void  setPersonService(PersonService personservice) 
	{
	this.personService=personservice;	
	 
	}
	
	@GetMapping("/getAllPersons")
	public @RequestBody List<Person> getAll()
	{
		
		return this.personService.getAllPersons();
		
	}
	
}
