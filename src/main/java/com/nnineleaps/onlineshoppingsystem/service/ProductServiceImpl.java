package com.nnineleaps.onlineshoppingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnineleaps.onlineshoppingsystem.entity.Customer;
import com.nnineleaps.onlineshoppingsystem.entity.Product;
import com.nnineleaps.onlineshoppingsystem.repository.CustomerRepository;
import com.nnineleaps.onlineshoppingsystem.repository.ProductRepository;

@Service
public class ProductServiceImpl implements IProductService{
	
	@Autowired
	private ProductRepository prodRepository;
	
	@Override
	public List<Product> getAllProducts() {
		return prodRepository.findAll();
	}

	@Override
	public Product getProductById(Long productId) {
		return prodRepository.findById(productId).get();	
	}

	@Override
	public Product updateProduct(Long productId, Product updatedProduct) {
		Product product =getProductById(productId); 
		if(product!=null) {
			product.setProductName(updatedProduct.getProductName());
			product.setProductCategory(updatedProduct.getProductCategory());
			product.setProductCategory(updatedProduct.getProductCategory());
		  }
		prodRepository.save(product);
		 
		return product;
	}

	@Override
	public void deleteProduct(Long productId) {
		prodRepository.deleteById(productId);
		
	}

	@Override
	public Product insertProduct(Product newProduct) {
		return prodRepository.save(newProduct);
	}

	@Override
	public List<Product> findByProductName(String productName) {
		return prodRepository.findByProductName(productName);
	}

}
