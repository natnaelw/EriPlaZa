package com.mum.eriplaza.repository;

import java.util.List;

import com.mum.eriplaza.domain.Category;

 public interface CategoryRepository   {
	
 
		public Category getCategory(int id);
		
		public List<Category> getAll();
		   
	
}
 
