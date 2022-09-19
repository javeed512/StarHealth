package com.set;

import java.util.HashSet;
import java.util.Set;

public class EmployeeHashSet {

	public static void main(String[] args) {
	
		
		Set<Employee>  set = new HashSet<Employee>();
		
		
		set.add(new Employee(102, "Tom", 5000));
		set.add(new Employee(104, "Jerry", 6000));
		set.add(new Employee(101, "Ford", 3000));
		set.add(new Employee(103, "Smith", 9000));
		
		
		System.out.println(set);
		
	}

}
