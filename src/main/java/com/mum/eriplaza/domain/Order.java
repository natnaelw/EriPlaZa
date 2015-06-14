package com.mum.eriplaza.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order {

	@Id
	private long id;
	private long orderId;
}
