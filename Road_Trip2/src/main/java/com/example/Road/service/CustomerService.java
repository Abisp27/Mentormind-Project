package com.example.Road.service;


	import org.springframework.stereotype.Service;

import com.example.Road.entities.Customer;

	
	@Service
	public interface CustomerService { 
		Customer login(int accout,int paymentinfo,String name);


		Customer addCustomer(Customer customer);

		Customer updateDb(int account,Customer customer);

		void deleteDb(int account);


		


		
	}



