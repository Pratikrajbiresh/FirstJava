package com.globalpayex.college.entities;

public class collegeuser  { // by default extends free object
	
	public String name;
	//1. can be accessed from a class outside the package provided it the derived class
	//2. can be accessed from a class within the same package (need not to be derived class)
	
	protected char gender;
	
	//composition relationship
	// HAS-A
	// Student HAS-A Address
	// Professor HAS-A Address
	private Address address;

	public collegeuser(String name, char gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	public String getDetails() {
		return String.format("Name: %s\nGender: %s\nAddress:%s", this.name, this.gender, this.getAddress());
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public char getGender() {
		return getGender();
	}
	
	/*
	 collegeuser(){
	 // this--> student object, professor object
 		}
	 */
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return String.format("%s", this.name,this.gender,this.getAddress());
		}

}
