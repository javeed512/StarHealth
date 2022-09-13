package com.starhealth.inheritance;

public  class Parent extends Object {

	int pid = 100;

	@Override
	public String  toString() {
		
		
		return "javeed";
	}
	
	
	public Parent() {

		super(); // it will call Object() default constructor

		System.out.println("Parent() is called object created");
	}

	public  void m1() {

		System.out.println("m1() from Parent class");

	}

	public void m1(int x) {

		System.out.println("m1() from Parent class");

	}
	
}
