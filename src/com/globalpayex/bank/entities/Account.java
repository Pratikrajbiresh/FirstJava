package com.globalpayex.bank.entities;

import com.globalpayex.bank.exceptions.minBalNotMaintainException;

public class Account {
	String accountNo;
	String accountType;
	double balance;
	
	public Account(String accountNo, String accountType, double balance) {
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.balance = balance;
	}
	

	public double withdraw(double amt) throws minBalNotMaintainException {
		System.out.println("Transaction Starts :");
		try {
			
		
		if (amt <= 0){
			throw new IllegalArgumentException("Withdrawl cannot be Negative");
		}
		if (this.balance - amt < 10000) {
			// throw an exception to the caller of the function
			//throw new IllegalStateException("Balance cannot go below 10000");
			throw new minBalNotMaintainException("Balance cannot go below 10000");
		}
		
		this.balance -= amt;
		return this.balance;
	} finally 
		{
		System.out.println("Transaction Ends!");
		}
		
		}
}
