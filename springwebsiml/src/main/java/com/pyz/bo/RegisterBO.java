package com.pyz.bo;

import java.io.Serializable;

import javax.persistence.Entity;

public class RegisterBO implements Serializable{
	
	private String userName;
	private String password;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public RegisterBO(){
		
	}
	
}