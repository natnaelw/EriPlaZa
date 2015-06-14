package com.mum.eriplaza.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mum.eriplaza.domain.Product;

public interface ProductRepository {

	List <Product> getAllProducts();
	
	Product getProductById(String productID);
	
	List<Product> getProductsByCategory(String category);

	Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
	
	void addProduct(Product product);		
}
