package com.mouritech.springmvc.model;

public class Customer {

	
	private int customerId;
	private String customerName;
	private float customerValue;
	

	public Customer() {
		// TODO Auto-generated constructor stub
	}


	public Customer(int customerId, String customerName, float customerValue) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerValue = customerValue;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public float getCustomerValue() {
		return customerValue;
	}


	public void setCustomerValue(float customerValue) {
		this.customerValue = customerValue;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerValue="
				+ customerValue + "]";
	}
	
	
	
}
