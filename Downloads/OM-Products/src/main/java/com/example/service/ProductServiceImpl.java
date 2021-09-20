package com.example.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import com.example.dto.Product;
import com.example.entity.ProductEntity;
import com.example.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductRepo productRepo;


	public Product getProductById(int id) {
		Product advertise1=null;
		Optional<ProductEntity> opadvertiseEntity=productRepo.findById(id);
		if(opadvertiseEntity.isPresent()) {
			ProductEntity advertiseEntity=opadvertiseEntity.get();
	advertise1=new Product(advertiseEntity.getId(),advertiseEntity.getName(),advertiseEntity.getPrice());
		
	}
		return advertise1;
}
}
