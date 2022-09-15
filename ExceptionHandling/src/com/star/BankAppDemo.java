package com.star;

public class BankAppDemo {

	public static void main(String args[]) {

		int accounts[] = {101,10,103,104,105};
		
		String[]  names = {"Adam","Smith","Tom","Jerry","Ford"};
		
		double  []balance = {5000.0,6000.0,500.0,15000.0,200.0};
		
		//int  ar[] ,ar2[] , y, z, x;
		
		//int[]  ar1 , ar2 , ar3;
		
		//int   []ar1 , x;
		
		//System.out.println(names.length);
		
		
		System.out.println("******WELCOME TO BANK APP******");
		
		System.out.println("ACCOUNTNO  NAMES   BALANCE");
		
		int  len = accounts.length;
		
		for (int i = 0; i < len; i++) {
			
	System.out.println(accounts[i]+" \t "+ names[i]+" \t  "+balance[i]);
			
			if(balance[i] < 1000) {
				
			try {	
			throw	new LowBalanceException("Sorry "+names[i] +" Your Balance is Low");
			}catch (LowBalanceException e) {

			//	e.printStackTrace();
				System.err.println(e);
				System.err.println("Please Deposit Some Amount");
			}
			}
	
			
		}
		
		
		
		
	}

}
