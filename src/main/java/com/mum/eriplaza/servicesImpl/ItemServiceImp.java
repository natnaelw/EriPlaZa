package com.mum.eriplaza.servicesImpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.mum.eriplaza.domain.Item;

import com.mum.eriplaza.repository.ItemRepository;

import com.mum.eriplaza.services.ItemService;

@Service
@Transactional
public class ItemServiceImp implements ItemService{
	
	@Autowired
	ItemRepository itemRepository;
		
	
	public Item  save(Item item) {
		return itemRepository.save(item);
		
	}
	
	
}
