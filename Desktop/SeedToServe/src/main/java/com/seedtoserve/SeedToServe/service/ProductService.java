package com.seedtoserve.SeedToServe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seedtoserve.SeedToServe.model.Product;
import com.seedtoserve.SeedToServe.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public void addProducts(Product product) {
		productRepository.save(product);
	}
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	
	public void removeProductById(long id) {
		productRepository.deleteById(id);
	}
	
	public Optional<Product> getProductById(long id){
		return productRepository.findById(id);
	}

	public List<Product> getAllProductsByCategoryId(int id){
		return productRepository.findAllByCategory_Id(id);
	}
}
