package e_commerce.poc.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import e_commerce.poc.entity.*;
import e_commerce.poc.repository.*;


@Service
public class CartService {
	
	@Autowired
	private CartRepository repo;

	public List<CartDetails> getCart() 
	{
		 List<CartDetails> list = new ArrayList<>();
			
		 for(CartDetails customer: repo.findAll())
		 {
			 list.add(customer);
		 }
		
		 	return list;
	}

	public CartDetails getCart(int id) {
		
		return repo.findById(id).get();
	}

	public void addCart(CartDetails listElement) {
		
		repo.save(listElement);
		
	}

	public void updateCart(CartDetails listElement) {
		
		repo.save(listElement);
	}

	public void delCart(int id) {
		repo.deleteById(id);
		
	}


	

}

