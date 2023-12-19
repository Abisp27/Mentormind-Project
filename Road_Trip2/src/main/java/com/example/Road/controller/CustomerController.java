package com.example.Road.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.Road.entities.Customer;
import com.example.Road.service.CustomerService;



	@RestController
	public class CustomerController {

		//@Autowired
	CustomerService customerService;

		@GetMapping("/login")
		public Customer login(@RequestHeader int account,@RequestHeader int paymentinfo,@RequestHeader String name) {

			return customerService.login(account, paymentinfo,name); 
		}

		@PostMapping("/post")
		public Customer addcustomer(@RequestBody Customer customer) {

			return customerService.addCustomer(customer);
		}

		@PutMapping("/update")
		public Customer update(@RequestHeader int account,@RequestHeader int paymentinfo,@RequestHeader String name, @RequestBody Customer customer ) {
			
			return customerService.updateDb(account,customer);
		}
		@DeleteMapping("/delete")
		public String delete(@RequestHeader int account) {
			customerService.deleteDb(account);
			return "data deleted";
		}
		
		

	}


