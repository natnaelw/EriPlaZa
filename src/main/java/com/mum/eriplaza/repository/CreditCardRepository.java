package com.mum.eriplaza.repository;

import com.mum.eriplaza.domain.CreditCard;

public interface CreditCardRepository {
	public boolean creditCardExists(CreditCard creditCard);
}
