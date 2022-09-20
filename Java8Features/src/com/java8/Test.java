package com.java8;

public class Test {

	public static void main(String[] args) {

		/*
		 * MyInterface mi = new AddImp();
		 * 
		 * int result = mi.add(4, 6);
		 * 
		 * System.out.println(result);
		 */

		// MyInterface mi = (int a,int b) -> {return a+b;};
		MyInterface mi = (x, y) -> {
			return x + y;
		};

		int result = mi.add(3, 9);

		System.out.println(result);

		mi.m2();

		/*
		 * DemoFunctionalInterface fi = (String s1) -> { System.out.println("Welcome " +
		 * s1); };
		 */

		DemoFunctionalInterface fi = System.out::println;
		fi.display("Javeed");

		/*
		 * DemoFunctionalInterface fi = ()->{return "StarHealth";};
		 * 
		 * String msg = fi.get(); System.out.println(msg);
		 */

		/*
		 * DemoFunctionalInterface fi = () ->{ return 5 > 3;};
		 * 
		 * System.out.println(fi.isValid());
		 */

		MyInterface.m1(); // static method from interface

	}

}
