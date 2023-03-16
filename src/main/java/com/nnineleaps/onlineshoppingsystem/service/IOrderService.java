package com.nnineleaps.onlineshoppingsystem.service;

import java.util.List;

import com.nnineleaps.onlineshoppingsystem.entity.Order;

public interface IOrderService {
	public List<Order>getAllOrders();
	public Order getOrderById(Long orderId);
	public Order updateOrder(Long orderId,Order updatedOrder);
	public void deleteOrder(Long orderId);
	public Order insertOrder(Order newOrder);
	public List<Order>findByOrderStatus(String orderStatus);

}
