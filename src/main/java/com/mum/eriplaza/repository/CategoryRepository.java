package com.mum.eriplaza.repository;


import java.util.Locale.Category;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends  CrudRepository<Category, Long> {
	
	
}
