package com.mum.eriplaza.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
@Entity
public class Category implements Serializable {
    private static final long serialVersionUID = 5658716793957904104L;
    @Id
    @GeneratedValue
    
    private Long Id;
    
    private String name;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Item> items;
    

	public List<Item> getItems() {
		return items;
	}

	public void addItems(Item item) {
		items.add(item);
	}

	public Category() {
    }
    
    public Category(Long Id, String name) {
        this.Id = Id;
        this.name = name;
    }
    
    public Long getId() {
        return Id;
    }
    public void setId(Long Id) {
        this.Id = Id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
