package com.wei.bean;

import java.io.Serializable;

public class Customer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String UserName;
	private String Password;
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer:[UserName="+UserName+"Password="+Password+"]";
	}
}
