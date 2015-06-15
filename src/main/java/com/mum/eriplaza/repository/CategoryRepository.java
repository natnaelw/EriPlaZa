package com.mum.eriplaza.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mum.eriplaza.domain.Category;
@Repository
public interface CategoryRepository extends CrudRepository<Category,Long>{

}
