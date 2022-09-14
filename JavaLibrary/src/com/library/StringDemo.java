package com.library;

public class StringDemo {

	public static void main(String[] args) {


		String s1 = "java"; // string literals
		
		String s3 = "java";
		
		String s2 = new String("java"); // string object
		String s4 = new String("java");
		
		System.out.println(s1 + " "+ s3);
		
		System.out.println(s2 +" "+ s4);
		
		
		
		
		System.out.println("String equals() compare values "+s1.equals(s3));
		
		System.out.println("String equals() compare values "+s2.equals(s4));
		
		
		System.out.println(s1 == s3);
		
		System.out.println(s2 == s4);
		
		
		String s5 = "java";
		
			s2 = s2.concat("lang");
			
			System.out.println(s2);
			
			s2 = s2 + "program";
			
			System.out.println(s2);
		
			
			String str1 = new String("A");
			String  str2 = new String("B");
			
			System.out.println(str1.compareTo(str2)); // 66  - 65 = 1
													// 65- 65 =0
			
			StringBuffer sb1 = new StringBuffer("java");
			
				sb1.append("lang");
			
				System.out.println(sb1);
				
				//System.out.println(sb1.reverse());
				
				System.out.println(sb1.replace(0, 2, "kt")); // 0,n-1
			
	}

}
