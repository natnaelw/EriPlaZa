package com.mum.eriplaza.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mum.eriplaza.domain.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

	@Query("SELECT i FROM Item i WHERE i.category.id = :categoryId")
	public List<Item> findItemsByCategory(
			@Param(value = "categoryId") Long categoryId);

	@Query("SELECT i FROM Item i WHERE i.category.id = :categoryId and i.itemCondition = :condition and i.unitPrice <= :price")
	public List<Item> findByFilter(
			@Param(value = "categoryId") Long categoryId,
			@Param(value = "condition") String condition,
			@Param(value = "price") double price);

	// @Query(value =
	// "SELECT  i FROM Item i  INNER JOIN i.user  ur  WHERE ur.id= :id")
	// List<Item> getAllItemsById(Long Id);

}
