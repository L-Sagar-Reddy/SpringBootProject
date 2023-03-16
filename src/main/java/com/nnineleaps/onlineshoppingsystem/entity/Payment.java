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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="payment")
public class Payment {
	
	@Id
	@Column(name="payment_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long paymentId;
	
	@Column(name="payment_Type")
	private String paymentType;
	
	@Column(name="payment_Date")
	private String paymentDate;
	
	@Column(name="payment_Time")
	private String paymentTime;
	
	@OneToOne(cascade=CascadeType.ALL)
	 @JoinColumn(name="delivery_Id",nullable=false,foreignKey=@ForeignKey(name=	 "fk_payment_delivery_id")) 
	 private Delivery payment_delivery_upd;
	
	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentTime() {
		return paymentTime;
	}

	public void setPaymentTime(String paymentTime) {
		this.paymentTime = paymentTime;
	}

	public Delivery getPayment_delivery_upd() {
		return payment_delivery_upd;
	}

	public void setPayment_delivery_upd(Delivery payment_delivery_upd) {
		this.payment_delivery_upd = payment_delivery_upd;
	}

	public Payment(Long paymentId, String paymentType, String paymentDate, String paymentTime,
			Delivery payment_delivery_upd) {
		super();
		this.paymentId = paymentId;
		this.paymentType = paymentType;
		this.paymentDate = paymentDate;
		this.paymentTime = paymentTime;
		this.payment_delivery_upd = payment_delivery_upd;
	}

	
	
	

}
