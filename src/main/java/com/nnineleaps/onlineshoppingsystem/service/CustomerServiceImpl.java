package com.nnineleaps.onlineshoppingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nnineleaps.onlineshoppingsystem.entity.Customer;
import com.nnineleaps.onlineshoppingsystem.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService {
	

	@Autowired
	private CustomerRepository custRepository;

	@Override
	public List<Customer> getAllCustomers() {
		return custRepository.findAll();
	}

	@Override
	public Customer getCustomerById(Long customerId) {
		return custRepository.findById(customerId).get();	
		}

	@Override
	public Customer updateCustomer(Long customerId, Customer updatedCustomer) {

		Customer customer =getCustomerById(customerId); 
		if(customer!=null) {
			customer.setCustomerName(updatedCustomer.getCustomerName());
			customer.setCustomerMobno(updatedCustomer.getCustomerMobno());
			customer.setCustomerAddress(updatedCustomer.getCustomerAddress());
		  }
		custRepository.save(customer);
		 
		return customer;
	}

	@Override
	public void deleteCustomer(Long customerId) {
		custRepository.deleteById(customerId);
		
	}

	@Override
	public Customer insertCustomer(Customer newCustomer) {
		return custRepository.save(newCustomer);
	}

	@Override
	public List<Customer> findByCustomerName(String customerName) {
		return custRepository.findByCustomerName(customerName);

}
}