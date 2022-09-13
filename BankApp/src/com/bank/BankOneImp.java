package com.bank;


/*
 *@Author: Raman
 *Date: 
 * Desc: IBank 1st implementation , only for deposit()
 * 
 */

public abstract class BankOneImp implements IBank{

	@Override
	public void deposit() {


		System.out.println("Deposit Successful , Thank you!");
		
	}

	
	public abstract  void withdraw();
	
	

}
