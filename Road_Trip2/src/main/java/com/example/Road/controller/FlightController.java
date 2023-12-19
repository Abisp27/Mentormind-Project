package com.example.Road.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.Road.entities.Flight;
import com.example.Road.service.FlightService;


@RestController
public class FlightController {

	//@Autowired
FlightService flightService;

	@GetMapping("/login")
	public Flight login(@RequestHeader String departureID,@RequestHeader String arrivalID,@RequestHeader String date) {

		return flightService.login(departureID, arrivalID,date); 
	}

	@PostMapping("/post")
	public Flight addflight(@RequestBody Flight flight) {

		return flightService.addFlight(flight);
	}

	@PutMapping("/update")
	public Flight update(@RequestHeader String departureID,@RequestHeader int arrivalID,@RequestHeader String date, @RequestBody Flight flight ) {
		
		return flightService.updateDb(date,flight);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestHeader String date) {
		flightService.deleteDb(date);
		return "data deleted";
	}
	
	

}


