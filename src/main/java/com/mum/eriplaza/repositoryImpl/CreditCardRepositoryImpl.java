package com.mum.eriplaza.repositoryImpl;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mum.eriplaza.domain.CreditCard;
import com.mum.eriplaza.repository.CreditCardRepository;

@Repository
public class CreditCardRepositoryImpl implements CreditCardRepository {

	@Override
	@Query("Select c from CreditCard where e.type :type and e.name = :name and e.number = :number and e.vcc = :vcc "
			+ "and e.expireMonth = :expireMonth and e.expireYear = : expireYear")
	public boolean creditCardExists(CreditCard creditCard) {
		// TODO Auto-generated method stub
		return false;
	}

}
