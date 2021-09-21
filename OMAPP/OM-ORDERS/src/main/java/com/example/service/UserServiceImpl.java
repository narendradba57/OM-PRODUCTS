package com.example.service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dto.Order;
import com.example.dto.Product;
import com.example.entity.OrderEntity;
import com.example.repo.UserRepo;
@Service
public class UserServiceImpl implements OrderService{
	@Autowired
	UserRepo userRepo;
	@Autowired
	UserServiceDelegate userServiceDelegate;
	public Order createOrder(Order order) {
		Product product=userServiceDelegate.getProductById(order.getProductId());
		OrderEntity advertiseEntity= new OrderEntity(order.getTitle(),order.getProductId(),order.getQuantity(),order.getTotalPrice());
		advertiseEntity=userRepo.save(advertiseEntity);
		//Order stock=new Order(advertiseEntity.getId(),advertiseEntity.getTitle(),advertiseEntity.getQuantity(),product.getId(),product.getName(),product.getPrice(),advertiseEntity.getTotalPrice());
		Order stock=new Order(advertiseEntity.getId(),advertiseEntity.getTitle(),advertiseEntity.getQuantity(),product,advertiseEntity.getTotalPrice());
		return stock;
		}
	public List<Order> getOrdersByTotalPrice(){
	List<OrderEntity> stockEntityList=userRepo.findAll();
	List<Order> stockList=new ArrayList<>();
	for(OrderEntity advertiseEntity: stockEntityList) {
			Product product=userServiceDelegate.getProductById(advertiseEntity.getProductId());
			Order stock=new Order(advertiseEntity.getId(),advertiseEntity.getTitle(),advertiseEntity.getQuantity(),product,advertiseEntity.getTotalPrice());
		stockList.add(stock);
	}
	
	stockList = stockList.stream().sorted(Comparator.comparing(Order::getTotalPrice)).collect(Collectors.toList());
	Collections.reverse(stockList);
	return stockList;

	}
}
