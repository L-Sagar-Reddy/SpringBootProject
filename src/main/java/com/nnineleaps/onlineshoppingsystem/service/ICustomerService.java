package com.nnineleaps.onlineshoppingsystem.service;

import java.util.List;

import com.nnineleaps.onlineshoppingsystem.entity.Customer;

public interface ICustomerService {
	
	public List<Customer>getAllCustomers();
	public Customer getCustomerById(Long customerId);
	public Customer updateCustomer(Long customerId,Customer updatedCustomer);
	public void deleteCustomer(Long customerId);
	public Customer insertCustomer(Customer newCustomer);
	public List<Customer>findByCustomerName(String customerName);

}
