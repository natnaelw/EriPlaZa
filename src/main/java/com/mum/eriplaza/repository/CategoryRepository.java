package com.mum.eriplaza.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mum.eriplaza.domain.Category;


@Repository
public interface CategoryRepository extends  CrudRepository<Category, Long> {
	
   
}
