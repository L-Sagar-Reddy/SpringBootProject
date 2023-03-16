package com.nnineleaps.onlineshoppingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nnineleaps.onlineshoppingsystem.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {
	

}
