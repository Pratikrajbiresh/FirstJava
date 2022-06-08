package com.globalpayex.geometry.entities;

import com.abc.geometry.entities.shape;

public class square extends shape{
	double side;
	public square (float side) {
		this.side = side;
		
	}
	public double areasquare() {
		return this.side*this.side;
	}
	public double perimetersquare() {
		return 4*this.side;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.side*this.side;
	}
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 4*this.side;
	}
}
