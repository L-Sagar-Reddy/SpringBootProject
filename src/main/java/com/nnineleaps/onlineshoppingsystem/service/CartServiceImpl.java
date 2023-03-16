package com.nnineleaps.onlineshoppingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnineleaps.onlineshoppingsystem.entity.Cart;
import com.nnineleaps.onlineshoppingsystem.entity.Customer;
import com.nnineleaps.onlineshoppingsystem.repository.CartRepository;
import com.nnineleaps.onlineshoppingsystem.repository.CustomerRepository;

@Service
public class CartServiceImpl implements ICartService{

	
	@Autowired
	private CartRepository cartRepository;
	
	@Override
	public List<Cart> getAllCarts() {
		return cartRepository.findAll();
	}

	@Override
	public Cart getCartById(Long cartId) {
		return cartRepository.findById(cartId).get();	
	}

	@Override
	public Cart updateCart(Long cartId, Cart updatedCart) {
		Cart cart =getCartById(cartId); 
		if(cart!=null) {
			cart.setCartName(updatedCart.getCartName());
			cart.setProductAddedToCart(updatedCart.getProductAddedToCart());
			cart.setProductAddedOn(updatedCart.getProductAddedOn());
		  }
		cartRepository.save(cart);
		 
		return cart;
	}

	@Override
	public void deleteCart(Long cartId) {
		cartRepository.deleteById(cartId);
		
	}

	@Override
	public Cart insertCart(Cart newCart) {
		return cartRepository.save(newCart);
	}

}
