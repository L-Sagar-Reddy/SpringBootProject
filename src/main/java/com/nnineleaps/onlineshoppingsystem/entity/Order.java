package com.nnineleaps.onlineshoppingsystem.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="orderinfo")
public class Order {
	

	@Id
	@Column(name="ordId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;
	
	@Column(name="ordStatus")
	private String orderStatus;
	
	@Column(name="ordDate")
	private String orderDate;
	

	 @OneToOne(cascade=CascadeType.ALL)
	 @JoinColumn(name="payment_Id",nullable=false,foreignKey=@ForeignKey(name=	 "fk_order_payment_id")) 
	 private Payment order_payment_upd;
	 
public Order() {
	// TODO Auto-generated constructor stub
}

public Long getOrderId() {
	return orderId;
}

public void setOrderId(Long orderId) {
	this.orderId = orderId;
}

public String getOrderStatus() {
	return orderStatus;
}

public void setOrderStatus(String orderStatus) {
	this.orderStatus = orderStatus;
}

public String getOrderDate() {
	return orderDate;
}

public void setOrderDate(String orderDate) {
	this.orderDate = orderDate;
}

public Payment getOrder_payment_upd() {
	return order_payment_upd;
}

public void setOrder_payment_upd(Payment order_payment_upd) {
	this.order_payment_upd = order_payment_upd;
}

public Order(Long orderId, String orderStatus, String orderDate, Payment order_payment_upd) {
	super();
	this.orderId = orderId;
	this.orderStatus = orderStatus;
	this.orderDate = orderDate;
	this.order_payment_upd = order_payment_upd;
}


}