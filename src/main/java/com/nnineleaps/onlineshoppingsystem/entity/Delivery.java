package com.nnineleaps.onlineshoppingsystem.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="delivery")
public class Delivery {
	
	@Id
	@Column(name="delivery_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long deliveryId;
	
	@Column(name="partner_name")
	@Size(min=3,message="partner name should contain minimum three alphabets")
	private String partnerName;
	
	@Column(name="partner_Mobno")
	@Size(min=10,max=10,message="phone number should have minimum 10 numbers")
	private String partnerMobno;
	
	@Column(name="customer_name")
	@Size(min=3,message="customer name should contain minimum three alphabets")
	private String customer_Name;
	
	@Column(name="customer_Mobno")
	@Size(min=10,max=10,message="phone number should have minimum 10 numbers")
	private String customer_Mobno;
	
	@Column(name="customer_Address")
	private String customer_Address;
	

	 
	
	public Delivery() {
		// TODO Auto-generated constructor stub
	}




	public Long getDeliveryId() {
		return deliveryId;
	}




	public void setDeliveryId(Long deliveryId) {
		this.deliveryId = deliveryId;
	}




	public String getPartnerName() {
		return partnerName;
	}




	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}




	public String getPartnerMobno() {
		return partnerMobno;
	}




	public void setPartnerMobno(String partnerMobno) {
		this.partnerMobno = partnerMobno;
	}




	public String getCustomer_Name() {
		return customer_Name;
	}




	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}




	public String getCustomer_Mobno() {
		return customer_Mobno;
	}




	public void setCustomer_Mobno(String customer_Mobno) {
		this.customer_Mobno = customer_Mobno;
	}




	public String getCustomer_Address() {
		return customer_Address;
	}




	public void setCustomer_Address(String customer_Address) {
		this.customer_Address = customer_Address;
	}




	public Delivery(Long deliveryId,
			@Size(min = 3, message = "partner name should contain minimum three alphabets") String partnerName,
			@Size(min = 10, max = 10, message = "phone number should have minimum 10 numbers") String partnerMobno,
			@Size(min = 3, message = "customer name should contain minimum three alphabets") String customer_Name,
			@Size(min = 10, max = 10, message = "phone number should have minimum 10 numbers") String customer_Mobno,
			String customer_Address) {
		super();
		this.deliveryId = deliveryId;
		this.partnerName = partnerName;
		this.partnerMobno = partnerMobno;
		this.customer_Name = customer_Name;
		this.customer_Mobno = customer_Mobno;
		this.customer_Address = customer_Address;
	}


	
	
}


