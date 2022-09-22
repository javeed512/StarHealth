package com.jdbc.cruds;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class JdbcCrudTest { // USER INTERFACE LAYER

	public static void main(String[] args) {

		CrudOperationDAO dao = new CrudOperationDAO();
		Scanner scanner = new Scanner(System.in);

		EmployeeService service = new EmployeeService();
		
		boolean flag = true;

		while (flag) {

			System.out.println("*******WELCOME TO EMPLOYEE MANAGEMENT SYSTEM*******");
			System.out.println("1. Add Employee");
			System.out.println("2. Update Employee");
			System.out.println("3. Delete Employee By Id");
			System.out.println("4. Select Employee By Id");
			System.out.println("5. Select All Employees");
			System.out.println("6. Logout/Exit");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:

				Employee emp = inputData();

				
			boolean isValid =	service.validateInputs(emp);
				
			if(isValid) {
				int count = dao.addEmployee(emp);

				System.out.println(count + " record inserted successfully");
			}
			else {
				
				System.err.println("Please Enter valid Inputs");
				
			}
				break;
				
				
			case 2:
				
					Employee emp2 = inputData();
					
					//update from DAO class
				
					int updateCount =	dao.updateEmployee(emp2);
					
					System.out.println(updateCount+" record updated successfully");
				
				break;
				
			case 3:
				
				System.out.println("Enter Id to Delete One Record");
				int deleteId =scanner.nextInt();
					
				int deleteCount =	dao.deleteEmployeeById(deleteId);
				
				System.out.println(deleteCount+" record deleted successfully");
				
				break;
				
			case 4:
				System.out.println("Enter Id to Select One Record");
				int searchId =scanner.nextInt();
				
				Employee  emp1 =	dao.selectEmployeeById(searchId);
				
				
				System.out.println(emp1);
				
				break;
				
			case 5:
				
				// select all 
				
				List<Employee> list =		dao.selectAllEmployeees();
				
			Stream<Employee> stream =	list.stream();
				
				
				//stream.forEach((Employee e1)-> {System.out.println(e1);});
			
			stream.forEach(System.out::println);
			
			
				break;
				
				
				
			case 6:
				
				//System.exit(0);// killing JVM
				
				System.out.println("Thank You , Logout Success");
				
				flag = false;
				
				break;

			default:
				break;
			}

		}

	}

	public static Employee inputData() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Eid");
		int eid = scanner.nextInt();
		System.out.println("Enter Ename");
		String ename = scanner.next();
		System.out.println("Enter salary");
		double salary = scanner.nextDouble();
		System.out.println("Enter Job");
		String job = scanner.next();
		System.out.println("Enter comm");
		int comm = scanner.nextInt();

		Employee emp = new Employee();
		emp.setEid(eid);
		emp.setEname(ename);
		emp.setSalary(salary);
		emp.setJob(job);
		emp.setComm(comm);

		return emp;

	}

}
