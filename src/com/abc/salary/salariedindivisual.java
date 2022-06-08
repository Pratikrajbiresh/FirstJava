package com.abc.salary;

public interface salariedindivisual {
	
	int getNoOfDaysworked();
	double getPriceperday();
	
	
	public default double calculate() {
		int noOfDays = this.getNoOfDaysworked();
		double costPerday = this.getPriceperday();
		
		double costWithoutTax = noOfDays * costPerday;
		int professionalTax = 200;
		double costWithTdsDeducted = costWithoutTax - (0.1 * costWithoutTax);
		return costWithTdsDeducted - professionalTax;

}
}
