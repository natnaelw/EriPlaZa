package com.mum.eriplaza.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mum.eriplaza.domain.Item;


@Repository
public interface ItemRepository extends CrudRepository<Item , Long>{

}
