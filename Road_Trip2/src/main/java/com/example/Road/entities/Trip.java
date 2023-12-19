package com.example.Road.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Trip {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length=20)
	private String startdate;
	@Column(length=20)
	private String enddate;
	@Column(length=20)
	private String hotel;
	
	public Trip () {
		
	}
	
	public Trip(String startdate,String enddate, String hotel ) {
		super();
		this.startdate = startdate;
		this.enddate = enddate;
		this.hotel = hotel;
		
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public String getHotel() {
		return hotel;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	@Override
	public String toString() {
		return "Trip [startdate=" + startdate + ", enddate=" + enddate + ", hotel=" + hotel + "]";
	}
	


}
