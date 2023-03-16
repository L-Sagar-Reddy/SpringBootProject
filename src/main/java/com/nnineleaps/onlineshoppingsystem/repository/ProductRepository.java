package com.nnineleaps.onlineshoppingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nnineleaps.onlineshoppingsystem.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
	public List<Product>findByProductName(String prodName);
}