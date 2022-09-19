package com.set;

public class Employee { // implements Comparable {
	
	private int eid;
	private String ename;
	private double salary;
	
	
	public Employee() {
		
		
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
		final int prime = 31;
		int result = 1;
		result = prime * result + eid;
		return result;
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

	/*
	 * @Override public int compareTo(Object o) {
	 * 
	 * int eid1=this.eid; int eid2=((Employee)o).eid; if(eid1<eid2) { return -1; }
	 * else if(eid>eid2) { return 1; } else return 0; }
	 */
	
	
	

}
