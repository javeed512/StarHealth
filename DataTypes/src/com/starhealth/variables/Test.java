package com.starhealth.variables;

public class Test {

	public static void main(String[] args) {


			Employee  e1 = new Employee();
			
			//System.out.println(e1.eid +" "+e1.ename);
			
			e1.display();
			
			e1.get();
			
			Employee.get();
			
			System.out.println(Employee.job);

	}
	
	public void  show() {
		Employee  e1 = new Employee();
		
	//	System.out.println(e1.eid);
	}

}
