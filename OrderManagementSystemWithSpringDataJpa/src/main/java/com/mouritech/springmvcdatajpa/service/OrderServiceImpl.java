package com.mouritech.springmvcdatajpa.service;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.springmvcdatajpa.entity.Order;
import com.mouritech.springmvcdatajpa.exception.OrderNotFoundException;
import com.mouritech.springmvcdatajpa.repository.OrderRepository;





@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepository orderRepository;

	@Transactional
	public List<Order> getAllOrders() {
		
		return orderRepository.findAll();
	}

	@Transactional
	public void saveOrder(Order theNewOrder) {
		
		orderRepository.save(theNewOrder);
	}

	@Transactional
	public Order getOrder(Long ordid) throws OrderNotFoundException{
		return orderRepository.findById(ordid)
				.orElseThrow(() -> new OrderNotFoundException(ordid));
	}
	
	@Transactional
	public void deleteOrder(Long ordid) {
		orderRepository.deleteById(ordid);
		
	}

	

}