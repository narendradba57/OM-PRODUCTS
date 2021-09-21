package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.dto.Product;
import com.example.service.ProductService;
@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	@GetMapping(value = "/product/{productId}", 
			produces= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
			public ResponseEntity<Product> getProductById(@PathVariable("productId") int id) {
		Product advertise1=productService.getProductById(id);
			return new ResponseEntity<Product>(advertise1, HttpStatus.OK);
			}
	
	
}
