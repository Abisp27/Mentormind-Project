package com.example.Road.serviceimpl;

import org.springframework.stereotype.Service;


import com.example.Road.entities.Flight;

import com.example.Road.repositary.FlightRepositary;

import com.example.Road.service.FlightService;
import com.example.library.exception.ResourceNotFoundException;

@Service
public class FlightServiceimpl implements FlightService {

	//@Autowired
    FlightRepositary flightRepositary;
	
	public Flight login(String departureID,String arrivalID,String date) {
		 Flight s = flightRepositary.findByDate(date);
		 
		 if(s!=null) {
			 if(s.getDate().equals(date)) {
				 return s;
			 }else {
				throw new ResourceNotFoundException();
			}
		 }else {
			 throw new ResourceNotFoundException();
		 }
	  
	}

	@Override
	public Flight addFlight(Flight flight) {
		return  flightRepositary.save(flight);
	}

	@Override
	public Flight updateDb(String date,Flight flight) {
		
		
		Flight s1 = flightRepositary.findByDate(date);
		
		if(s1!=null) {
			s1.setDepartureID(flight.getDepartureID());   
			s1.setArrivalID(flight.getArrivalID());
			s1.setDate(flight.getDate());
			
		return flightRepositary.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
	}

	@Override
	public void deleteDb(String Date) {
	
		
		Flight s2 = flightRepositary.findByDate(Date);
		
		if(s2!=null) {
			flightRepositary.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}		 
	}

	@Override
	public Flight login1(String departureID, String arrivalID, String date) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	
}



