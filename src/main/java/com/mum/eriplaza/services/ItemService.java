package com.mum.eriplaza.services;

import java.util.List;


import com.mum.eriplaza.domain.Item;

public interface ItemService {
	
	public List<Item> findAll();
	public Item find(Long itemId);
	public List<Item> findItemsByCategory(Long categoryId);
	public Item  save(Item item);
	
//	public List<Item> getAllItems(Long id);
	
//	public Item find(Long id);


}
