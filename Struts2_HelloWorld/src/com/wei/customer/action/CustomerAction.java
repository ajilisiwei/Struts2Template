package com.wei.customer.action;

public class CustomerAction {
	public String add() {
		System.out.println("add_method");
		return "add";
	}
	
	public String delete() {
		System.out.println("delete_method");
		return "delete";
	}
	
	public String update() {
		System.out.println("update_method");
		return "update";
	}
}
