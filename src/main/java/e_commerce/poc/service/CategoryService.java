package e_commerce.poc.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import e_commerce.poc.entity.*;
import e_commerce.poc.repository.*;


@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepos repo;

	public List<CatgEnty> getCategory() 
	{
		 List<CatgEnty> list = new ArrayList<>();
			
		 for(CatgEnty customer: repo.findAll())
		 {
			 list.add(customer);
		 }
		
		 	return list;
	}

	public CatgEnty getCategory(int id) {
		
		return repo.findById(id).get();
	}

	public void addCategory(CatgEnty listElement) {
		
		repo.save(listElement);
		
	}

	public void updateCategory(CatgEnty listElement) {
		
		repo.save(listElement);
	}

	public void deleteCategory(int id) {
		repo.deleteById(id);
		
	}


	

}

