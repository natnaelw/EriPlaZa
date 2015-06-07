package com.mum.eriplaza.repositoryImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



import com.mum.eriplaza.repository.CategoryRepository;

public class CategoryRepositoryImpl implements CategoryRepository {
	
	private List<String> categories;
	
	public CategoryRepositoryImpl() {
       
        String[] categoriesList = {"Electronics","Entertainment","Motors","Fashion","RealEstate"};
        categories = new ArrayList<String>(Arrays.asList(categoriesList));
        
    }
	
 @Override
public List<String> getAll() {
    return categories;
}

}
