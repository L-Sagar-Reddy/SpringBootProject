package com.nnineleaps.onlineshoppingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nnineleaps.onlineshoppingsystem.entity.Customer;
import com.nnineleaps.onlineshoppingsystem.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Long> {

}
