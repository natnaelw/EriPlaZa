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
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepo;

	
	
	public List<Item> findAll() {
		return (List<Item>)itemRepo.findAll();
	}
	
	public Item find(Long itemId){
		return itemRepo.findOne(itemId);
	}

	public List<Item> findItemsByCategory(Long categoryId){
		return (List<Item>)itemRepo.findItemsByCategory(categoryId);
	}
	
	public Item  save(Item item) {
		return itemRepo.save(item);
		
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
