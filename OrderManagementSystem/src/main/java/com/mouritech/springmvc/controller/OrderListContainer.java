package com.mouritech.springmvc.controller;

import java.util.List;

import com.mouritech.springmvc.model.Order;



public class OrderListContainer {
	
	 private List<Order> orders;

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}