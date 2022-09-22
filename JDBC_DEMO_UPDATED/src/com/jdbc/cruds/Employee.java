package com.jdbc.cruds;

import java.sql.Date;

public class Employee {
	
	
	private  int eid;
	private String ename;
	private double salary;
	private  String job;
	private  Date doj;
	private int comm;
	
	
	public Employee() {
		
		
	}


	public Employee(int eid, String ename, double salary, String job, Date doj, int comm) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.job = job;
		this.doj = doj;
		this.comm = comm;
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


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public Date getDoj() {
		return doj;
	}


	public void setDoj(Date doj) {
		this.doj = doj;
	}


	public int getComm() {
		return comm;
	}


	public void setComm(int comm) {
		this.comm = comm;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", job=" + job + ", doj=" + doj
				+ ", comm=" + comm + "]";
	}
	
	
	
	

}
