package com.instance;

public class Student extends Object {

// Data hiding	
	private static int sid; // 0
	private static String sname; // null
	private static double fee; // 0.0

	public Student() {

		super();

	}

	public Student(int sid, String sname, double fee) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.fee = fee;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	
	
	
	
	
	
}