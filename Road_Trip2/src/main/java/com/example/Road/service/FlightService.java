package com.example.Road.service;

import org.springframework.stereotype.Service;


import com.example.Road.entities.Flight;

	
	@Service
	public interface FlightService { 
		Flight login(String departureID,String arrivalID,String date);


		Flight addFlight(Flight flight);

		Flight updateDb(String date,Flight flight);

		void deleteDb(String date);


		Flight login1(String departureID, String arrivalID, String date);
	}


		


		