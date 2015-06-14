package com.mum.eriplaza.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CreditCard {
	@Id
	private long id;
	
	private String name;
	private String number;
	private String expireMonth;
	private String expireYear;
	private String cvv;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getExpireMonth() {
		return expireMonth;
	}

	public void setExpireMonth(String expMonth) {
		this.expireMonth = expMonth;
	}

	public String getExpireYear() {
		return expireYear;
	}

	public void setExpireYear(String expYear) {
		this.expireYear = expYear;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	

}
