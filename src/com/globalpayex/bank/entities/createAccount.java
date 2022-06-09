package com.globalpayex.bank.entities;

import com.globalpayex.bank.exceptions.minBalNotMaintainException;

public class createAccount {
	public static void main(String[] args) {
		Account a = new Account("PZ256", "Savings", 25000);
		//System.out.println(a.deposit(15000));
		//System.out.println(a.withdraw(2000));
		
		/*try {
			System.out.println(a.withdraw(-5000));
		}
		catch (IllegalStateException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch (IllegalArgumentException a) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}*/
		try {
			System.out.println(a.withdraw(-96));
		} catch (minBalNotMaintainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
