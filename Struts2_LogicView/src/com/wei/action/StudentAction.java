package com.wei.action;

import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	public String regist() {
		System.out.println(Name);
		return null;
	}
	
}
