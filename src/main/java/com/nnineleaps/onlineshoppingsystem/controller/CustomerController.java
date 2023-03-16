package com.nnineleaps.onlineshoppingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nnineleaps.onlineshoppingsystem.entity.Customer;
import com.nnineleaps.onlineshoppingsystem.service.ICustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private ICustomerService custService;
	
	@PostMapping("/insertcustomer")
	public String insertCustomer(@RequestBody Customer newCustomer) {
		custService.insertCustomer(newCustomer);
		return "Customer added successfully!!";
	}
	
	@DeleteMapping("/deletecustomer/{custid}")
	public void deleteCustomer( @PathVariable ("custid")Long customerId ){
		custService.deleteCustomer(customerId);
	}
	
	@GetMapping("/getallcustomers")
	public List<Customer>getAllCustomers(){
		return custService.getAllCustomers();
	}
	
	@PutMapping("/updatecustomer/{custid}")
	public Customer updateCustomer(@PathVariable("custid")Long customerId,@RequestBody Customer updatedCustomer) {
		return custService.updateCustomer( customerId, updatedCustomer);
	}
	
	@GetMapping("/getcustomerbyid/{custid}")
	public Customer getCustomerById(@PathVariable("custid")Long customerId) {
		return custService.getCustomerById(customerId);
	}
	
	@GetMapping("/getcustomerbyname/{customername}")
	public List<Customer>findByCustomerName(@PathVariable ("customername")String customerName){
		return custService.findByCustomerName(customerName);
	}

}
