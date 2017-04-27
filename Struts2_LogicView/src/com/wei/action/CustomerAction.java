package com.wei.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wei.bean.Customer;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Customer customer= new Customer();
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public String regist() {
		System.out.println(customer);
		if ("wei".equals(customer.getUserName())&&"wei".equals(customer.getPassword())) {
			return SUCCESS;
		}else {
			return ERROR;
		}
	}

	@Override
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}

}
