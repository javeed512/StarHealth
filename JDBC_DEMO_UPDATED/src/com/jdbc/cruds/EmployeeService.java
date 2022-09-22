package com.jdbc.cruds;

public class EmployeeService {

	public boolean validateInputs(Employee emp) {

			boolean isValid = false;
		
		if (emp.getEid() > 99 && emp.getEname().length() > 3 && emp.getSalary() > 1000 && emp.getComm() > 0) {

			isValid = true;
		}
		
		return isValid;

	}

}
