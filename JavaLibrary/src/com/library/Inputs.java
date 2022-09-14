package com.library;

import java.util.Scanner;

public class Inputs {

	public static void main(String[] args) {

		Scanner  sc = new Scanner(System.in);// HAS A Relationship
		
		
		
		System.out.println("Enter Name ");
		
				// sc.next(); // reads only one word at a time
		
		String name =	sc.nextLine(); // read complete line of data
		
		
		System.out.println(name);
		
		System.out.println("Enter Income"); // "5000"
		
		/*
		 * String s = sc.next(); int income = Integer.parseInt(s);
		 */
		
		int income = sc.nextInt();
			
			System.out.println(income); // 5000
			
			sc.nextLine(); // to control new line \n
		
		System.out.println("Enter city");
		String city = sc.nextLine();
		
		System.out.println(city);
		
	}

}
