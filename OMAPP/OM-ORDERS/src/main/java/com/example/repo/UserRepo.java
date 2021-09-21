package com.example.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.OrderEntity;
public interface UserRepo extends JpaRepository <OrderEntity,Integer>{

}
