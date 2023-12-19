package com.example.Road.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.Road.entities.Customer;
import com.example.Road.repositary.CustomerRepositary;
import com.example.Road.service.CustomerService;
import com.example.library.exception.ResourceNotFoundException;


@Service
public class CustomerServiceimpl implements CustomerService {

	//@Autowired
	CustomerRepositary customerRepositary;
	
	@Override
	public Customer login(int account,int paymentinfo,String name) {
		 Customer s = customerRepositary.findByAccount(account);
		 
		 if(s!=null) {
			 if(s.getName().equals(name)) {
				 return s;
			 }else {
				throw new ResourceNotFoundException();
			}
		 }else {
			 throw new ResourceNotFoundException();
		 }
	  
	}

	@Override
	public Customer addCustomer(Customer customer) {
		return  customerRepositary.save(customer);
	}

	@Override
	public Customer updateDb(int account,Customer customer) {
		
		
		Customer s1 = customerRepositary.findByAccount(account);
		
		if(s1!=null) {
			s1.setAccount(customer.getAccount());   
			s1.setPaymentinfo(customer.getPaymentinfo());
			s1.setName(customer.getName());
			
		return customerRepositary.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
	}

	@Override
	public void deleteDb(int account) {
	
		
		Customer s2 = customerRepositary.findByAccount(account);
		
		if(s2!=null) {
			customerRepositary.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}		 
	}

	

	
	
}



