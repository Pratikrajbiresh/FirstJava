package com.globalpayex.college.entities;

public class studentdetails extends collegeuser {
	
	
	public int roll;
	public float marks;
	
	
	public studentdetails(String name, char gender, int roll, float marks) {
		super(name,gender); //calls the super class constructor
		// Internally
		// collegeuser(this)
		
		this.name = name;
		this.gender = gender;
		this.roll = roll;
		this.marks = marks;
	} 
	
	/*@Override
	public String getDetails() {
		String str1 = super.getDetails();
		// TODO Auto-generated method stub
		return String.format("%s\nRoll: %s\nMarks: %s", str1,this.roll,this.marks);
	}*/
	

}
