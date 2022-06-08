package com.abc.geometry;

import com.abc.geometry.entities.shape;
import com.globalpayex.geometry.entities.square;

public class shapestatistics {
	
	public static void print(shape shape) {
		System.out.println("**** STATISTICS *****");
		System.out.println(String.format("Area : %s", shape.area()));
		System.out.println(String.format("Perimeter: %s", shape.perimeter()));
		System.out.println("**** STATISTICS *****");
	}
	
	
}
