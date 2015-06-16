package com.mum.eriplaza.domain;

public class SearchDTO {
	
	private String category;
	private String item;
	private String searchBy;
	private String itemCondition;
	private String user;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getSearchBy() {
		return searchBy;
	}
	public void setSearchBy(String searchBy) {
		this.searchBy = searchBy;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getItemCondition() {
		return itemCondition;
	}
	public void setItemCondition(String itemCondition) {
		this.itemCondition = itemCondition;
	}
	
	

}
