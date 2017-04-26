package com.wei.strutsaction;

public class ChainAction {
	public String sayHello() {
		System.out.println("hello,我是使用chain跳转到不同名称空间的action的method...");
		return "success";
	}
}
