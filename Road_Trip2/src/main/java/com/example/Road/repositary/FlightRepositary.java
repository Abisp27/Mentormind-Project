package com.example.Road.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Road.entities.Flight;



	@Repository
	public interface FlightRepositary extends JpaRepository<Flight, Integer> {

		@Query(value =  "select * from Flight where Date =?" , nativeQuery = true)
		Flight findByDate(String date);
	}

		


