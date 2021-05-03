package e_commerce.poc.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import e_commerce.poc.entity.*;
import e_commerce.poc.repository.*;


@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repo;

	public List<CustomerDetails> getCustomers() 
	{
		 List<CustomerDetails> list = new ArrayList<>();
			
		 for(CustomerDetails customer: repo.findAll())
		 {
			 list.add(customer);
		 }
		
		 	return list;
	}

	public CustomerDetails getCustomer(int id) {
		
		return repo.findById(id).get();
	}

	public void addCustomer(CustomerDetails listElement) {
		
		repo.save(listElement);
		
	}

	public void updateCustomer(CustomerDetails listElement) {
		
		repo.save(listElement);
	}

	public void deleteCustomer(int id) {
		repo.deleteById(id);
		
	}


	

}

