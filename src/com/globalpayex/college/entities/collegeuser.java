package com.globalpayex.college.entities;

public class collegeuser  { // by default extends free object
	
	public String name;
	
	public char gender;

	public collegeuser(String name, char gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	public String getDetails() {
		return String.format("Name: %s\nGender: %s", this.name, this.gender);
	}
	
	/*
	 collegeuser(){
	 // this--> student object, professor object
 		}
	 */
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return String.format("%s", this.name,this.gender);
		}

}
