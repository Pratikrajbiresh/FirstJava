package com.globalpayex.geometry.entities;

import com.abc.geometry.entities.shape;

public class rectangle extends shape{
	double length;
	double breadth;
	public rectangle(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public double arearectangle() {
		return this.length*this.breadth;
	}
	public double perimeterrectangle() {
		return 4*(this.length+this.breadth);
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.length*this.breadth;
	}
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 4*(this.length+this.breadth);
	}
	

}
