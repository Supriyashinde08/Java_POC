package e_commerce.poc.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import e_commerce.poc.entity.*;
import e_commerce.poc.repository.*;


@Service
public class ProductItemsService {
	
	@Autowired
	private ProductItemsRepos repo;

	public List<ProductDetails> getProductItems() 
	{
		 List<ProductDetails> list = new ArrayList<>();
			
		 for(ProductDetails customer: repo.findAll())
		 {
			 list.add(customer);
		 }
		
		 	return list;
	}

	public ProductDetails getProductItems(int id) {
		
		return repo.findById(id).get();
	}

	public void addProductItems(ProductDetails listElement) {
		
		repo.save(listElement);
		
	}

	public void updateProductItems(ProductDetails listElement) {
		
		repo.save(listElement);
	}

	public void deleteProductItems(int id) {
		repo.deleteById(id);
		
	}


	

}

