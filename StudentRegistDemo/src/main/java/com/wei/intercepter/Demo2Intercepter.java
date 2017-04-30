package com.wei.intercepter;

import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class Demo2Intercepter extends AbstractInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("动作执行前...");
		HttpSession session=ServletActionContext.getRequest().getSession();
		Object obj=session.getAttribute("user");
		if (obj==null) {
			return "login";
		}
		String rtValue = invocation.invoke();
		System.out.println("动作执行后...");
		return rtValue;
	}

}
