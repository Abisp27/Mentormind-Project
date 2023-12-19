package com.example.Road.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.Road.entities.Trip;
import com.example.Road.service.TripService;



	@RestController
	public class TripController {

		//@Autowired
	TripService tripService;

		@GetMapping("/login")
		public Trip login(@RequestHeader String startdate,@RequestHeader String enddate,@RequestHeader String hotel) {

			return tripService.login(startdate, enddate,hotel); 
		}

		@PostMapping("/post")
		public Trip addtrip(@RequestBody Trip trip) {

			return tripService.addTrip(trip);
		}

		@PutMapping("/update")
		public Trip update(@RequestHeader String startdate,@RequestHeader String enddate,@RequestHeader String hotel, @RequestBody Trip trip ) {
			
			return tripService.updateDb(hotel,trip);
		}
		@DeleteMapping("/delete")
		public String delete(@RequestHeader String hotel) {
			tripService.deleteDb(hotel);
			return "data deleted";
		}
		
		

	}





