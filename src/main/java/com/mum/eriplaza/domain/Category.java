package com.mum.eriplaza.domain;

import java.io.Serializable;

import javax.persistence.Entity;
@Entity
public class Category implements Serializable {
    private static final long serialVersionUID = 5658716793957904104L;
    private int id;
    private String name;
    
//    @OneToMany 
//    private List<Item> items;
  
    
//    public List<Item> getItems() {
//		return items;
//	}
//
//	public void setItems(List<Item> items) {
//		this.items = items;
//	}

	public Category() {
    }
    
    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
