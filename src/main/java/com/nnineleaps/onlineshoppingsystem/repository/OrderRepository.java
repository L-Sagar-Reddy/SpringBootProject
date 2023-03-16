package com.nnineleaps.onlineshoppingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nnineleaps.onlineshoppingsystem.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
	public List<Order>findByOrderStatus(String ordStatus);
}
