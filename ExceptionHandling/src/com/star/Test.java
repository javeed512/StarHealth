package com.star;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) { // caller
		// TODO Auto-generated method stub

		System.out.println("Open File");
		System.out.println("Read File Data");
		
		int bill = 0;
		String name = "tom";
		
		try {
		 bill =	Test.div(3000,30);
		 System.out.println(bill);
			System.out.println("Update File Data");
			
			
		 System.out.println(name.length());
		 
		}
		catch (ArithmeticException e) { // Exception e = new ArithmeticExp();

			//e.printStackTrace();
			System.err.println("Sorry You Can't div number by zero");
			
			System.out.println(e.toString());
			
		}
		catch (NullPointerException ne) { // ne = new NullPointerException();
			
			ne.printStackTrace();
		}
		finally {
			
			System.out.println("Close File");
			
		}
		
		
		
		
		
		
		
		
	}
	
	public static int  div(int amount,int discount)throws ArithmeticException { // callee
		
		return amount/discount;
		
	}
	
	
	

}
