package com.mum.eriplaza.repository;

import com.mum.eriplaza.domain.Order;

public interface OrderRepository {
	int  saveOrder(Order order);
}
