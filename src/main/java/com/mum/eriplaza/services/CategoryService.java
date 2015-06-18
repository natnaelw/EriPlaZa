package com.mum.eriplaza.services;

import java.util.List;

import com.mum.eriplaza.domain.Category;
import com.mum.eriplaza.domain.Item;


public interface CategoryService {
	
				
		public List<Category> findAll();
		
		public Category  saveCategory(Category category);
		
		public Category find(Long catId);
		
		
		   
	
}


