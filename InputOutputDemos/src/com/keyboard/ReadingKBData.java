package com.keyboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadingKBData {

	public static void main(String[] args) {


			//System.out.println("hello");
			
			//Scanner scanner = new Scanner(System.in);
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			try {
				/*
				 * int n = br.read();
				 * 
				 * System.out.println((char)n);
				 */
				
			System.out.println("Enter Name");
			String name =	br.readLine();
				
			
			System.out.println(name);
			
			System.out.println("Enter Salary");
			 String data = br.readLine();
			 
			int sal = Integer.parseInt(data);
			 
			 System.out.println(sal + 1000);
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		

	}

}
