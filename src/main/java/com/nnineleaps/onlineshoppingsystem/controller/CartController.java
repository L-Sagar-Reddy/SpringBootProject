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

import com.nnineleaps.onlineshoppingsystem.entity.Cart;
import com.nnineleaps.onlineshoppingsystem.entity.Customer;
import com.nnineleaps.onlineshoppingsystem.service.ICartService;
import com.nnineleaps.onlineshoppingsystem.service.ICustomerService;

@RestController
public class CartController {
	
	@Autowired
	private ICartService cartService;
	
	@PostMapping("/insertcart")
	public String insertCart(@RequestBody Cart newCart) {
		cartService.insertCart(newCart);
		return "Cart added successfully!!";
	}
	
	@DeleteMapping("/deletecart/{cartid}")
	public void deleteCart( @PathVariable ("cartid")Long cartId ){
		cartService.deleteCart(cartId);
	}
	
	@GetMapping("/getallcarts")
	public List<Cart>getAllCarts(){
		return cartService.getAllCarts();
	}
	
	@PutMapping("/updatecart/{cartid}")
	public Cart updateCart(@PathVariable("cartid")Long cartId,@RequestBody Cart updatedCart) {
		return cartService.updateCart( cartId, updatedCart);
	}
	
	@GetMapping("/getcartbyid/{cartid}")
	public Cart getCartById(@PathVariable("cartid")Long cartId) {
		return cartService.getCartById(cartId);
	}
	

}
