package com.set;

import java.util.Comparator;

public class MyComparator  implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		
			String s1 =  e1.toString();
			String s2 = e2.toString();
			
			return -s1.compareTo(s2);
		
	}

	/*
	 * @Override public int compare(String s1, String s2) {
	 * 
	 * 
	 * 
	 * return -s1.compareTo(s2); }
	 */
	
	
	

}
