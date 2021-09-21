package com.example.service;

import java.util.List;

import com.example.dto.Order;
public interface OrderService {
	public Order createOrder(Order order);
	public List<Order> getOrdersByTotalPrice();
}
