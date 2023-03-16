package com.nnineleaps.onlineshoppingsystem.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="product ")
public class Product {
	

	@Id
	@Column(name="prodId")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	
	@Column(name="prodName")
	private String productName;
	
	@Column(name="prodCategory")
	private String productCategory;
	
	@Column(name="prodPrice")
	private String productPrice;
	
	


	public Product() {
		// TODO Auto-generated constructor stub
	}




	public Long getProductId() {
		return productId;
	}




	public void setProductId(Long productId) {
		this.productId = productId;
	}




	public String getProductName() {
		return productName;
	}




	public void setProductName(String productName) {
		this.productName = productName;
	}




	public String getProductCategory() {
		return productCategory;
	}




	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}




	public String getProductPrice() {
		return productPrice;
	}




	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}




	public Product(Long productId, String productName, String productCategory, String productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
	}

	
	
	
	
	

}