package com.library;

public class Employee { // POJO or ENTITY or BEAN
	
		private int eid;
		private String ename;   // Data Hiding
		private double salary;
		
		public Employee() {
			super();
		}
		
		
		public Employee(int eid, String ename, double salary) {
			super();
			this.eid = eid;
			this.ename = ename;
			this.salary = salary;
		}


		public int getEid() {
			return eid;
		}


		public void setEid(int eid) {
			this.eid = eid;
		}


		public String getEname() {
			return ename;
		}


		public void setEname(String ename) {
			this.ename = ename;
		}


		public double getSalary() {
			return salary;
		}


		public void setSalary(double salary) {
			this.salary = salary;
		}


		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
		}


		@Override
		public int hashCode() {
			return eid;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (eid != other.eid)
				return false;
			return true;
		}


		


		
	
		
		
		

		
}
