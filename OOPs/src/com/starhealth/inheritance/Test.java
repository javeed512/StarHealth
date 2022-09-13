package com.starhealth.inheritance;

public class Test {

	public static void main(String[] args) {

		/*
		 * Parent p = new Parent();
		 * 
		 * 
		 * System.out.println(p.toString());
		 * 
		 * System.out.println(p.pid);
		 * 
		 * p.m1();
		 */

		Parent p = new Parent();

		System.out.println(p.toString());

		

		

		/*
		 * Object o = new Child();
		 * 
		 * System.out.println(o);
		 */

		/*
		 * Parent p1 = (Parent) new Child();
		 * 
		 * System.out.println(p1.toString());
		 * 
		 * Child c3 = (Child) p; // explicit type casting in objects
		 * 
		 * System.out.println(c3.toString());
		 */

		// Child c2 = (Child) new Object(); // not possible

		// System.out.println(c2);
		/*
		 * char c1 = (char)65;
		 * 
		 * System.out.println(c1);
		 */

		String s1 = new String("hello world");

		System.out.println(s1.toString());
		
		
		
		Child c = new Child();

		
		
		System.out.println(c.toString());
		
		c.m1();

		
		Parent p1 = new Child();
		
		p1.m1();
		
	}

}
