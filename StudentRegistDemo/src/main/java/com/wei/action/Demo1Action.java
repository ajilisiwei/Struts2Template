package com.wei.action;

import com.opensymphony.xwork2.ActionSupport;

public class Demo1Action extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		return SUCCESS;
	}

	public String regist() {
		System.out.println("成功");
		return "success";
	}
}
