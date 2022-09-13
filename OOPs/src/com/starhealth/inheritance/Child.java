package com.starhealth.inheritance;

public class Child extends Parent {

	int cid = 99;
	
	@Override
	public String toString() {
		
		
		return "StarHealth";
		
	}
	
	@Override
	public void m1() {
		
		System.out.println("m1() from Child class..");
		
	}
	
	
	
	public Child() {
		
		super();  // Parent() is called here
		
		System.out.println("Child() is called object created..");
		
		
		
		
	}
	
	
	public void m2() {
		
		System.out.println("m2() from child class");
		
	}
	
	
	
	
}
