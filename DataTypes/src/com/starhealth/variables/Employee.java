package com.starhealth.variables;

public class Employee {
	
private    int eid;

	String ename; // default
	

	static String  job;
	
	public static void main(String[] args) {
		
		Employee  e1 =		new  Employee();

			System.out.println(e1.eid);
			System.out.println(e1.ename);
			
			System.out.println(job);
			

			
			e1.display();
			
			get();
	}

	
	public  void  display() {
		
		System.out.println("welcome to display()");
		
		System.out.println(eid);
		
		System.out.println(job);
		
		get();
	}
	
	
	public static void  get() {
		
		
		System.out.println("Hi am static get()");
	}
	
}
