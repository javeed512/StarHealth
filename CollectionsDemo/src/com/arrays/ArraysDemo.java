package com.arrays;

public class ArraysDemo {

	public static void main(String[] args) {
	
		int   ar1[] = {101,102,103,104,105}; // new Integer([]);
		
		int ar2[]  = new int[5];// Integer
		
		ar2[0] = 501;
		ar2[1] = 502;
		
		
		System.out.println(ar2.length);
		System.out.println(ar2);
	
			for (int i = 0; i < ar2.length; i++) {
				
				System.out.println(ar2[i]);
				
				
				
			}
			
			
			// FOR EACH LOOP
			
			for (int element : ar1) {
				
				System.out.println(element);
				
			}
			
		
		
	}

}
