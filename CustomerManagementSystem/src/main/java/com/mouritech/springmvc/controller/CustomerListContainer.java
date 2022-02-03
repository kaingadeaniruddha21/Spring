package com.mouritech.springmvc.controller;

import java.util.List;

import com.mouritech.springmvc.model.Customer;


public class CustomerListContainer {
	
	 private List<Customer> customers;

	public List<Customer> getCustomer() {
		return customers;
	}

	public void setOrders(List<Customer> customers) {
		this.customers = customers;
	}

}