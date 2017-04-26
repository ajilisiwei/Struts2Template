package com.wei.strutsaction;

import com.opensymphony.xwork2.ActionSupport;

public class NamespaceAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("使用chain转发到不同命名空间的action...");
		return SUCCESS;
	}
	
}
