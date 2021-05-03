package e_commerce.poc.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import e_commerce.poc.entity.*;
import e_commerce.poc.repository.*;


@Service
public class OrderService {
	
	@Autowired
	private OrderRepos repo;

	public List<OrderDetails> getOrder() 
	{
		 List<OrderDetails> list = new ArrayList<>();
			
		 for(OrderDetails customer: repo.findAll())
		 {
			 list.add(customer);
		 }
		
		 	return list;
	}

	public OrderDetails getOrder(int id) {
		
		return repo.findById(id).get();
	}

	public void addOrder(OrderDetails listElement) {
		
		repo.save(listElement);
		
	}

	public void updateOrder(OrderDetails listElement) {
		
		repo.save(listElement);
	}

	public void deleteOrder(int id) {
		repo.deleteById(id);
		
	}


	

}

