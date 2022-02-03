package com.mouritech.springmvc.controller;


import com.mouritech.springmvc.model.Order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/order")
public class OrderController {
	

	public List<Order> orderList() {
		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order(123,LocalDateTime.of(2021, 11, 11, 11, 11).toString(),568.23f));
		orders.add(new Order(123,LocalDateTime.of(2021, 10, 11, 12, 10).toString(),678.23f));
		orders.add(new Order(123,LocalDateTime.of(2021, 8, 1, 12, 10).toString(),578.23f));
		return orders;
		
	}

	@RequestMapping(value = "/listorder", method = RequestMethod.GET)
	  public String getUsers(Model model) throws Exception{
	    List<Order> orders = orderList();
	    OrderListContainer neworderList = new OrderListContainer();
	    neworderList.setOrders(orders);
	    model.addAttribute("Orders", neworderList);
	    return "orderlist";
	  }
}