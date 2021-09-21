package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.dto.Product;
import com.example.entity.ProductEntity;
import com.example.repo.ProductRepo;

@Component
public class DataInsertRunner implements ApplicationRunner {
	@Autowired
	ProductRepo productRepo;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Executing the command line runner, Application arguments: " +Arrays.toString(args.getSourceArgs()));
		
		 List<ProductEntity> empInList = new ArrayList<ProductEntity>();
		 empInList.add(new ProductEntity(3,"Car",4000));
		 empInList.add(new ProductEntity(4,"Bike",5000));
		 empInList.add(new ProductEntity(5,"Motor",4000));
		 empInList.add(new ProductEntity(6,"Car",4000));
		 productRepo.saveAll(empInList);
	}

}
