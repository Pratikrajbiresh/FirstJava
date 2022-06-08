package com.globalpayex.college.entities;

import com.abc.salary.salariedindivisual;

public class professor extends collegeuser implements salariedindivisual {
	
	double costperday;
	int workingdays;
	
	
	
	String[] subjects;

	public professor(String name, char gender, String[] subjects, double costperday, int workingdays) {
		super(name,gender);
		
		this.subjects = subjects;
		this.costperday = costperday;
		this.workingdays = workingdays;
	}

	@Override
	public int getNoOfDaysworked() {
		// TODO Auto-generated method stub
		return this.workingdays;
	}

	@Override
	public double getPriceperday() {
		// TODO Auto-generated method stub
		return this.costperday;
	}
	

}
