package com.starhealth.datatypes.primitive;

import java.lang.*; // default package

public class PrimitiveDataTypes extends Object {

	public static void main(String[] args) {

		String s =	new String("Javeed");
		
		Integer len =	s.length();
		
		System.out.println(len);
		
		
			byte b = (byte) 150; // -2pow7   to 2pow7  -1
							// -128 to 127
			
			short  s1 =  300;
			
			int n = (int) s1;  // -2pow31  to  2pow31  -1
			// implicit type casting or  widening
			
			byte b1 = (byte) n;
			// explicit type casting or narrowing
			
				long mobileNo = 998877665544L;
				
				double	d =	4.12345678901234566;
			
				
					double d2 = mobileNo;
					
					System.out.println(d2);
				
				
					float f = 9.999F;
					
					float f2 = (float) mobileNo;
					
					System.out.println(f2);
					
					
					
					
				System.out.println(Integer.MIN_VALUE);
				
				System.out.println(Integer.MAX_VALUE);
		
		
		
		
		
		System.out.println("Welcome Back");
		
		System.out.println(b);
		
		
			boolean  bool = false;
			
			String s2 = null;

	}

}

