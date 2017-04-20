package com.wei.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public String execute() throws Exception {
        System.out.println("正在执行的Action");
        //返回逻辑视图SUCCESS
        return SUCCESS;
    }

}
