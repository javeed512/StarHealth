package com.bank;

import java.util.Scanner;

/*
 * @Author: Sumit
 * 
 */

public class UserView {

	public static void main(String[] args) {

		System.out.println("******WELCOME TO ATM*******");
		System.out.println("1. DEPOSIT");
		System.out.println("2. WITHDRAW");
		System.out.println("3. EXIT");

		Scanner scanner = new Scanner(System.in); // "1"

		int choice = scanner.nextInt();

		
		IBank b = Util.getObject();
		
		switch (choice) {
		case 1:

				b.deposit();
			break;
		case 2:
				b.withdraw();
				
			break;
		case 3:
			System.out.println("Thank you visit again");
				System.exit(0);
				
				
			break;

		default:
			break;
		}

	}

}
