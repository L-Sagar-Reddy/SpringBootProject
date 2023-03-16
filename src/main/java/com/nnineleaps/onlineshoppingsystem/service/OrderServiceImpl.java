package com.nnineleaps.onlineshoppingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnineleaps.onlineshoppingsystem.entity.Customer;
import com.nnineleaps.onlineshoppingsystem.entity.Order;
import com.nnineleaps.onlineshoppingsystem.repository.CustomerRepository;
import com.nnineleaps.onlineshoppingsystem.repository.OrderRepository;

@Service
public class OrderServiceImpl implements IOrderService {

	@Autowired
	private OrderRepository ordRepository;
	
	
	@Override
	public List<Order> getAllOrders() {
		return ordRepository.findAll();
	}

	@Override
	public Order getOrderById(Long orderId) {
		return ordRepository.findById(orderId).get();	
	}

	@Override
	public Order updateOrder(Long orderId, Order updatedOrder) {
		Order order =getOrderById(orderId); 
		if(order!=null) {
			order.setOrderStatus(updatedOrder.getOrderStatus());
			order.setOrderDate(updatedOrder.getOrderDate());
		  }
		ordRepository.save(order);
		 
		return order;
	}

	@Override
	public void deleteOrder(Long orderId) {
		ordRepository.deleteById(orderId);
		
	}

	@Override
	public Order insertOrder(Order newOrder) {
		return ordRepository.save(newOrder);
	}

	@Override
	public List<Order> findByOrderStatus(String orderStatus) {
		return ordRepository.findByOrderStatus(orderStatus);
	}

}
