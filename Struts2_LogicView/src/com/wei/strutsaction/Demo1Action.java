package com.wei.strutsaction;

import com.opensymphony.xwork2.ActionSupport;

public class Demo1Action extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("正在执行的Demo1Action.execute方法...");
		return SUCCESS;
	}
}
