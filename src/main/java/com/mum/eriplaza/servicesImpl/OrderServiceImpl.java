package com.mum.eriplaza.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mum.eriplaza.domain.Order;
import com.mum.eriplaza.repository.OrderRepository;
import com.mum.eriplaza.services.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public int saveOrder(Order order) {
		int orderId = orderRepository.saveOrder(order);
		return orderId;
	}

}
