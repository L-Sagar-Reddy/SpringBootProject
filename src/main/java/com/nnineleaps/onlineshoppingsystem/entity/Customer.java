package com.nnineleaps.onlineshoppingsystem.entity;

import javax.validation.constraints.Size;

import com.nnineleaps.onlineshoppingsystem.entity.Customer;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="customer")
public class Customer {
	

	@Id
	@Column(name="custId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerId;
	
	
	@Column(name="custName")
	@Size(min=3,message="customer name should contain minimum three alphabets")
	private String customerName;
	
	@Column(name="custMobno")
	@Size(min=10,max=10,message="phone number should have minimum 10 numbers")
	private String customerMobno;
	
	@Column(name="custAddress")
	private String customerAddress;
	
	
	  @OneToMany(cascade=CascadeType.ALL)
	  @JoinColumn(name="ordId",nullable=false,foreignKey=@ForeignKey(name= "fk_customer_order_id"),insertable = false, updatable = false) 
	  private List< Order> customer_order_upd= new ArrayList<>();
	 

	public Customer() {
		// TODO Auto-generated constructor stub
	}


	public Long getCustomerId() {
		return customerId;
	}


	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerMobno() {
		return customerMobno;
	}


	public void setCustomerMobno(String customerMobno) {
		this.customerMobno = customerMobno;
	}


	public String getCustomerAddress() {
		return customerAddress;
	}


	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}


	public List<Order> getCustomer_order_upd() {
		return customer_order_upd;
	}


	public void setCustomer_order_upd(List<Order> customer_order_upd) {
		this.customer_order_upd = customer_order_upd;
	}


	public Customer(Long customerId,
			@Size(min = 3, message = "customer name should contain minimum three alphabets") String customerName,
			@Size(min = 10, max = 10, message = "phone number should have minimum 10 numbers") String customerMobno,
			String customerAddress, List<Order> customer_order_upd) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerMobno = customerMobno;
		this.customerAddress = customerAddress;
		this.customer_order_upd = customer_order_upd;
	}


	
	
	
	
	
	
}