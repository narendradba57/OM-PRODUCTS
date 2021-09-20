package com.example.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.ProductEntity;
public interface ProductRepo extends JpaRepository <ProductEntity,Integer>{

}
