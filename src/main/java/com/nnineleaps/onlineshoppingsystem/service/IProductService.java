package com.nnineleaps.onlineshoppingsystem.service;

import java.util.List;

import com.nnineleaps.onlineshoppingsystem.entity.Product;

public interface IProductService {
	
	public List<Product>getAllProducts();
	public Product getProductById(Long productId);
	public Product updateProduct(Long productId,Product updatedProduct);
	public void deleteProduct(Long productId);
	public Product insertProduct(Product newProduct);
	public List<Product>findByProductName(String productName);


}
