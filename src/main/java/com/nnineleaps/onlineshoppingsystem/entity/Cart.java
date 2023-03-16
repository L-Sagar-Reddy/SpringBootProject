
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
@Table(name="cart")
public class Cart {
	
	@Id
	@Column(name="cartId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cartId;
	
	
	@Column(name="cartName")
	@Size(min=3,message="customer name should contain minimum three alphabets")
	private String cartName;
	
	@Column(name="prodAddedToCart")
	private String productAddedToCart;
	
	@Column(name="prodAddedOn")
	private String productAddedOn;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="prodId",nullable=false,foreignKey=@ForeignKey(name="fk_cart_product_id"), insertable = false, updatable = false)
	private List<Product> cart_product_upd = new ArrayList<>();
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="payment_Id",nullable=false,foreignKey=@ForeignKey(name="fk_cart_payment_id"))
    private Payment cart_payment_upd;
	
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}


	public Long getCartId() {
		return cartId;
	}


	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}


	public String getCartName() {
		return cartName;
	}


	public void setCartName(String cartName) {
		this.cartName = cartName;
	}


	public String getProductAddedToCart() {
		return productAddedToCart;
	}


	public void setProductAddedToCart(String productAddedToCart) {
		this.productAddedToCart = productAddedToCart;
	}


	public String getProductAddedOn() {
		return productAddedOn;
	}


	public void setProductAddedOn(String productAddedOn) {
		this.productAddedOn = productAddedOn;
	}


	public List<Product> getCart_product_upd() {
		return cart_product_upd;
	}


	public void setCart_product_upd(List<Product> cart_product_upd) {
		this.cart_product_upd = cart_product_upd;
	}


	public Payment getCart_payment_upd() {
		return cart_payment_upd;
	}


	public void setCart_payment_upd(Payment cart_payment_upd) {
		this.cart_payment_upd = cart_payment_upd;
	}


	public Cart(Long cartId,
			@Size(min = 3, message = "customer name should contain minimum three alphabets") String cartName,
			String productAddedToCart, String productAddedOn, List<Product> cart_product_upd,
			Payment cart_payment_upd) {
		super();
		this.cartId = cartId;
		this.cartName = cartName;
		this.productAddedToCart = productAddedToCart;
		this.productAddedOn = productAddedOn;
		this.cart_product_upd = cart_product_upd;
		this.cart_payment_upd = cart_payment_upd;
	}
	
	
	

}
