package com.example.Road.service;


	import org.springframework.stereotype.Service;

import com.example.Road.entities.Trip;

	

		
		@Service
		public interface TripService { 
			Trip login(String departureID,String arrivalID,String hotel);


			Trip addTrip(Trip trip);

			Trip updateDb(String hotel,Trip trip);

			void deleteDb(String hotel);


			


			

}
