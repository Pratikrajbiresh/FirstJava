package com.globalpayex.college.entities;

public class Studentold {
	
	//instance attributes
	public String Name;
	public char Gender;
	int roll;
	float marks; 
	
	
	// class attributes
	
	public static int count;
	
	//overloaded constructors
	
	public Studentold() {
	this("NB", 'm', 25, 95f);
	}
	
	//constructor
	public Studentold(String Name, char Gender, int roll, float marks) {
		this.Name = Name;
		this.Gender = Gender;
		this.roll = roll;
		this.marks = marks;
		++Studentold.count;
	}
	
	public String getDetails() {
		
		return String.format("Name: %s\nGender: %s\nroll: %s\nmarks: %s", this.Name,this.Gender,this.roll,this.marks);
		//return "Name: " + this.Name + "\nGender: " + this.Gender + "\nroll: " + this.roll + "\nmarks: " + this.marks;
	}
	
	public char getGrade() {
		char grade;
		
		if(marks<0 || marks>100) {
			grade = 'I';
		} else if (marks >= 70) {
			grade = 'A';
		} else if (marks >= 60) {
			grade = 'B';
		} else if (marks >= 50) {
			grade = 'C';
		} else {
			grade = 'F';
		}
		return grade;
	}
	
	public static Studentold newInstance(String Name, char Gender, int roll, float marks) {
		//System.out.println(this);
		return new Studentold(Name, Gender, roll, marks);
	}
	}

