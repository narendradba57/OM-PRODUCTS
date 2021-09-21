package com.example.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.dto.Product;
@Service
public class UserServiceDelegateImpl implements UserServiceDelegate{
	@Autowired
	RestTemplate restTemplate;
	public Product getProductById(int productId) {
		HttpHeaders headers= new HttpHeaders();
		HttpEntity entity=new HttpEntity(headers);
		String url="http://localhost:9000/product/{productId}";
		ResponseEntity<Product> product=this.restTemplate.getForEntity(url, Product.class, productId);
		Product product1=product.getBody();
	return product1;
	}
}
