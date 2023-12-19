package com.example.Road.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Flight {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String departureID;
	private int arrivalID;
	@Column(length=20)
	private String date;
	
	public Flight () {
		
	}
	
	public Flight(String departureID, int arrivalID, String date ) {
		super();
		this.departureID = departureID;
		this.arrivalID = arrivalID;
		this.date = date;
		
	}

	public String getDepartureID() {
		return departureID;
	}

	public void setDepartureID(String departureID) {
		this.departureID = departureID;
	}

	public int getArrivalID() {
		return arrivalID;
	}

	public void setArrivalID(int arrivalID) {
		this.arrivalID = arrivalID;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Flight [departureID=" + departureID + ", arrivalID=" + arrivalID + ", date=" + date + "]";
	}
	


}
