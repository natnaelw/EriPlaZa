package com.mum.eriplaza.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mum.eriplaza.domain.Order;
import com.mum.eriplaza.exception.InvalidOrderException;
import com.mum.eriplaza.repository.OrderRepository;
import com.mum.eriplaza.services.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public long saveOrder(Order order) {
		Order orderReturned = orderRepository.save(order);
		return orderReturned.getOrderId();
	}

	@Override
	public Order validate(long orderId) {
		Order order = orderRepository.read(orderId);
		if(order != null){
			throw new InvalidOrderException(orderId);
		}
		return null;
	}

	
	
	
}
