package com.mum.eriplaza.services;

import com.mum.eriplaza.domain.Order;

public interface OrderService {
	
	long saveOrder(Order order);
	Order validate(long orderId);
}
