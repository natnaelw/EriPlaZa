package com.mum.eriplaza.servicesImpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mum.eriplaza.repository.CategoryRepository;
import com.mum.eriplaza.services.CategoryService;


@Service
public class CategoryServiceImpl implements CategoryService {
		
		@Autowired
		CategoryRepository categoryRepository;
		
	  	public List<String> getAll() {
			return categoryRepository.getAll();
		}
		
	}


