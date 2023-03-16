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
import com.nnineleaps.onlineshoppingsystem.entity.Order;
import com.nnineleaps.onlineshoppingsystem.service.ICustomerService;
import com.nnineleaps.onlineshoppingsystem.service.IOrderService;

@RestController
public class OrderController {
	
	@Autowired
	private IOrderService ordService;
	
	@PostMapping("/insertorder")
	public String insertOrder(@RequestBody Order newOrder) {
		ordService.insertOrder(newOrder);
		return "Order added successfully!!";
	}
	
	@DeleteMapping("/deleteorder/{ordid}")
	public void deleteOrder( @PathVariable ("ordid")Long orderId ){
		ordService.deleteOrder(orderId);
	}
	
	@GetMapping("/getallorders")
	public List<Order>getAllOrders(){
		return ordService.getAllOrders();
	}
	
	@PutMapping("/updateorder/{ordid}")
	public Order updateOrder(@PathVariable("ordid")Long orderId,@RequestBody Order updatedOrder) {
		return ordService.updateOrder( orderId, updatedOrder);
	}
	
	@GetMapping("/getoderbyid/{ordid}")
	public Order getOrderById(@PathVariable("ordid")Long orderId) {
		return ordService.getOrderById(orderId);
	}
	
	@GetMapping("/getorderbystatus/{orderstatus}")
	public List<Order>findByOrderStatus(@PathVariable ("orderstatus")String orderStatus){
		return ordService.findByOrderStatus(orderStatus);
	}
	
}
