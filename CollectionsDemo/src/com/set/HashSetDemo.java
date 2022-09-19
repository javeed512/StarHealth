package com.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		
		Integer i = new Integer(50);
			
			Set<Integer> set =	new HashSet<Integer>();
		
				set.add(103);
				set.add(102);
				System.out.println(set.add(101));// added
				set.add(105);
				set.add(104);
				System.out.println(set.add(101));// not added
				set.add(null);
				
				System.out.println(set);
				
				
		

	}

}
