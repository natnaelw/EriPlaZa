package com.mum.eriplaza.repositoryImpl;

import org.springframework.stereotype.Repository;

import com.mum.eriplaza.domain.Order;
import com.mum.eriplaza.repository.OrderRepository;

@Repository
public class OrderRepositoryImpl implements OrderRepository {

	@Override
	public int saveOrder(Order order) {
		return 0;
	}

}
