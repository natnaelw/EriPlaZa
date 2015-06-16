package com.mum.eriplaza.repository;

import com.mum.eriplaza.domain.Order;

public interface OrderRepository {
	Order save(Order order);
	Order read(long orderId);
	
}
