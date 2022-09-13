package com.bank;

public class Util {
	
	
	public static IBank  getObject(){
		
		
		return new BankTwoImp();
		
	}
	

}
