package com.globalpayex.college.entities;

public class Address { 
	private String add;
	private int pincode;
	private String country;
	
	public Address(String add, String country, int pincode) {
		this.add = add;
		this.country = country;
		this.pincode = pincode;
		
	}

	public String getAddress() {
		return add;
	}

	public void setAddress(String add) {
		this.add = add;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getDetails() {
		return String.format("Address : %s\nCountry : %s\nPincode : %s", this.add,this.country,this.pincode);
	}

}
