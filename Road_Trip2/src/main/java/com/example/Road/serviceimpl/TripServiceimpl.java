package com.example.Road.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.Road.entities.Flight;
import com.example.Road.entities.Trip;
import com.example.Road.repositary.FlightRepositary;
import com.example.Road.repositary.TripRepositary;
import com.example.Road.service.FlightService;
import com.example.Road.service.TripService;
import com.example.library.exception.ResourceNotFoundException;

@Service
public class TripServiceimpl implements TripService {

	//@Autowired
    TripRepositary tripRepositary;
	
	@Override
	public Trip login(String startdate,String enddate,String hotel) {
		 Trip s = tripRepositary.findByHotel(hotel);
		 
		 if(s!=null) {
			 if(s.getHotel().equals(hotel)) {
				 return s;
			 }else {
				throw new ResourceNotFoundException();
			}
		 }else {
			 throw new ResourceNotFoundException();
		 }
	  
	}

	@Override
	public Trip addTrip(Trip trip) {
		return  tripRepositary.save(trip);
	}

	@Override
	public Trip updateDb(String hotel,Trip trip) {
		
		
		Trip s1 = tripRepositary.findByHotel(hotel);
		
		if(s1!=null) {
			s1.setStartdate(trip.getStartdate());   
			s1.setEnddate(trip.getEnddate());
			s1.setHotel(trip.getHotel());
			
		return tripRepositary.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
	}

	@Override
	public void deleteDb(String Hotel) {
	
		
		Trip s2 = tripRepositary.findByHotel(Hotel);
		
		if(s2!=null) {
			tripRepositary.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}		 
	}

	

	
	
}



