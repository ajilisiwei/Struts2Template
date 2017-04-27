package com.wei.action;

import com.opensymphony.xwork2.ActionSupport;
import com.wei.bean.Person;

public class PersonAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Person person=new Person();
	
	public Person getPerson() {
		System.out.println("getPerson...");
		return this.person;
	}
	
	public void setPerson(Person person) {
		System.out.println("setPerson...");
		this.person=person;
	}
	
	public String regist() {
		System.out.println("regist...");
		if ("wei".equals(person.getUserName())&&"wei".equals(person.getPassword())) {
			return SUCCESS;
		}else {
			return ERROR;
		}
	}

}
