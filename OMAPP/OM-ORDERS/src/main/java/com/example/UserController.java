package com.example;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.dto.Order;
import com.example.service.OrderService;
@RestController
public class UserController {
	@Autowired
	OrderService userDetailsService;
	@PostMapping(value = "/order", 
			produces= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
			public ResponseEntity<Order> createOrder(@RequestBody Order order) {
		Order advertise1=userDetailsService.createOrder(order);
			return new ResponseEntity<Order>(advertise1, HttpStatus.OK);
			}
	@GetMapping(value = "/order/sort/desc/totalprice", 
			produces= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
			public ResponseEntity<List<Order>> getOrdersByTotalPrice() {
		List<Order> advertise1=userDetailsService.getOrdersByTotalPrice();
			return new ResponseEntity<List<Order>>(advertise1, HttpStatus.OK);
			}
}
