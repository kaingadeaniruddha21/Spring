package com.mouritech.springmvcdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.springmvcdatajpa.entity.Order;



@Repository("orderRepository")
public interface OrderRepository extends JpaRepository<Order, Long> {

}