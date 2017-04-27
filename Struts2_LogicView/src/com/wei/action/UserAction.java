package com.wei.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

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
	
	public String regist() {
		System.out.println(UserName+":"+Password);
		if ("wei".equals(UserName) && "wei".equals(Password)) {
			return SUCCESS;
		}else {
			return ERROR;
		}
	}
	
}
