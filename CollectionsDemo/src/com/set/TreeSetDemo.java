package com.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {


		Set<String>  set = new TreeSet<String>();
		
		set.add("B");
		set.add("D");
		set.add("A");
		set.add("C");
		
		System.out.println(set);
		
		
		Set<Employee>  set2 = new TreeSet<Employee>(new MyComparator());
		
		set2.add(new Employee(102, "Tom", 5000));
		set2.add(new Employee(104, "Jerry", 6000));
		set2.add(new Employee(101, "Ford", 3000));
		set2.add(new Employee(103, "Smith", 9000));
		
		System.out.println(set2);
		
		
		

	}

}
