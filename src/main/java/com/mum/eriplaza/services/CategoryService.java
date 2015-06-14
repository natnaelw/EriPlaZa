package com.mum.eriplaza.services;

import java.util.List;

import com.mum.eriplaza.domain.Category;

 public interface CategoryService  {
	
 
		public Category getCategory(int id);
		
		public List<Category> getAll();
		   
	
}
 
