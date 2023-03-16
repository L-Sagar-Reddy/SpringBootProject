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

import com.nnineleaps.onlineshoppingsystem.entity.Order;
import com.nnineleaps.onlineshoppingsystem.entity.Product;
import com.nnineleaps.onlineshoppingsystem.service.IOrderService;
import com.nnineleaps.onlineshoppingsystem.service.IProductService;

@RestController
public class ProductController {

	@Autowired
	private IProductService prodService;
	
	@PostMapping("/insertproduct")
	public String insertProduct(@RequestBody Product newProduct) {
		prodService.insertProduct(newProduct);
		return "Product added successfully!!";
	}
	
	@DeleteMapping("/deleteproduct/{prodid}")
	public void deleteProduct( @PathVariable ("prodid")Long productId ){
		prodService.deleteProduct(productId);
	}	
	
	@GetMapping("/getallproducts")
	public List<Product>getAllProducts(){
		return prodService.getAllProducts();
	}
	
	@PutMapping("/updateproduct/{prodid}")
	public Product updateProduct(@PathVariable("prodid")Long productId,@RequestBody Product updatedProduct) {
		return prodService.updateProduct( productId, updatedProduct);
	}
	
	@GetMapping("/getproductbyid/{prodid}")
	public Product getProductById(@PathVariable("prodid")Long productId) {
		return prodService.getProductById(productId);
	}
	
	@GetMapping("/getproductbyname/{productname}")
	public List<Product>findByProductName(@PathVariable ("productname")String productName){
		return prodService.findByProductName(productName);
	}
}
