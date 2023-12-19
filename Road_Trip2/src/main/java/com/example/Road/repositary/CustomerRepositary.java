package com.example.Road.repositary;


	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.data.jpa.repository.Query;
	import org.springframework.stereotype.Repository;

import com.example.Road.entities.Customer;

	

	@Repository
	public interface CustomerRepositary extends JpaRepository<Customer, Integer> {

		@Query(value =  "select * from Customer where Account =?" , nativeQuery = true)
		Customer findByAccount(int account);
	}

		
		


