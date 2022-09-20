package com.java8;

@FunctionalInterface
public interface MyInterface { 
	
	
	public abstract  int add(int a,int b);
	
	// void  setName(String name);  // consumer
	//int  getValue(); // supplier
	
	//boolean  verify(); // supplier
	
	// boolean verify(long l); // predicate
	
	
	public static void  m1() {
		
		System.out.println("This is static method in java8 interface");
		
	}
	
	public default void m2() {
		
		
		System.out.println("This is default method in java8 interface");
	}
	
	

}
