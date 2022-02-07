package com.mouritech.springmvcdatajpa.service;


import java.util.List;

import com.mouritech.springmvcdatajpa.entity.Order;
import com.mouritech.springmvcdatajpa.exception.OrderNotFoundException;





public interface OrderService {

	List<Order> getAllOrders();

	void saveOrder(Order theNewOrder);

	Order getOrder(Long ordid) throws OrderNotFoundException;

	void deleteOrder(Long ordid);

}