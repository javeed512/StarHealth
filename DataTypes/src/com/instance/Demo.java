package com.instance;

public class Demo {

	public static void main(String[] args) {


		
		Student  s1 = new Student(101,"javeed",5000);
		
		
		Student s2 = new Student(102, "Sumit", 7000);
		
		
		
		
		
		Student s3 = new Student();
			
			s3.setSname("RAhul");
		
			System.out.println(s3.getSid() +" "+ s3.getSname()+"  "+s3.getFee());
			
			
			System.out.println(s1.getSid() +" "+ s1.getSname()+"  "+s1.getFee());
			
			System.out.println(s2.getSid() +" "+ s2.getSname()+"  "+s2.getFee());
			
	}

}
