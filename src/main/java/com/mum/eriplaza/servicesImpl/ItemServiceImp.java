package com.mum.eriplaza.servicesImpl;



import java.util.List;

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
	
//	public List<Item> getAllItems(Long id){
//		
//		return itemRepository.getAllItemsById(id);
//	}
//	
//	public Item find(Long id){
//		 return itemRepository.findOne(id);
//		
//	}
}
