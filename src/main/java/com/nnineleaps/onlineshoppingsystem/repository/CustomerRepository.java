package com.nnineleaps.onlineshoppingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nnineleaps.onlineshoppingsystem.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
	public List<Customer>findByCustomerName(String custName);
}
