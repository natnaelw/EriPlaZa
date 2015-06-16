package com.mum.eriplaza.repository;

import org.springframework.data.repository.CrudRepository;

import com.mum.eriplaza.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{
//	Order save(Order order);
//	Order read(long orderId);
	
}
