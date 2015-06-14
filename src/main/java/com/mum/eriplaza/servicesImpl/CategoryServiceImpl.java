package com.mum.eriplaza.servicesImpl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mum.eriplaza.domain.Category;
import com.mum.eriplaza.domain.Item;
import com.mum.eriplaza.repository.CategoryRepository;
import com.mum.eriplaza.services.CategoryService;


@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
		
		@Autowired
		CategoryRepository categoryRepository;
		
	  	public List<Category> getAll() {
			return (List<Category>) (Iterator)categoryRepository.findAll();
		}
	  	
	  
		
	}


