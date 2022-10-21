package com.zensar.olx.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loginUsers10")
public class LoginUser {

	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 private String name;
	 private String password;
	 private String emailId;
	public LoginUser(int id, String name, String password, String emailId) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.emailId = emailId;
	}
	public LoginUser() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "LoginUser [id=" + id + ", name=" + name + ", password=" + password + ", emailId=" + emailId + "]";
	}
	 
	 
	 
	
}
