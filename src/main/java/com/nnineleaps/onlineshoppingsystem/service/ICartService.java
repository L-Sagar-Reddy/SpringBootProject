package com.nnineleaps.onlineshoppingsystem.service;

import java.util.List;

import com.nnineleaps.onlineshoppingsystem.entity.Cart;

public interface ICartService {
 
	public List<Cart>getAllCarts();
	public Cart getCartById(Long cartId);
	public Cart updateCart(Long cartId,Cart updatedCart);
	public void deleteCart(Long cartId);
	public Cart insertCart(Cart newCart);
}
