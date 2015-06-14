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

	public String getExpMonth() {
		return expireMonth;
	}

	public void setExpMonth(String expMonth) {
		this.expireMonth = expMonth;
	}

	public String getExpYear() {
		return expireYear;
	}

	public void setExpYear(String expYear) {
		this.expireYear = expYear;
	}

}
