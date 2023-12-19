package com.example.Road.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Customer {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int account;
	private int paymentinfo;
	@Column(length=20)
	private String name;
	
	public Customer () {
		
	}
	
	public Customer(int account, int paymentinfo, String name ) {
		super();
		this.account = account;
		this.name = name;
		
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public int getPaymentinfo() {
		return paymentinfo;
	}

	public void setPaymentinfo(int paymentinfo) {
		this.paymentinfo = paymentinfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [account=" + account + ", paymentinfo=" + paymentinfo + ", name=" + name + "]";
	}
	
}

	
		