package com.mum.eriplaza.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



import com.mum.eriplaza.domain.Item;


@Repository
public interface ItemRepository extends CrudRepository<Item , Long>{
	
//	@Query(value = "SELECT  i FROM Item i  INNER JOIN i.user  ur  WHERE ur.id= :id")
//    List<Item> getAllItemsById(Long Id);

}
