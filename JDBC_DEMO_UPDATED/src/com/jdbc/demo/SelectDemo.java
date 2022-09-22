package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {

	public static void main(String[] args) {
		
		Connection conn = null;
		try {
		//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

		Class.forName("com.mysql.cj.jdbc.Driver");
			
		  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/starhealth_db", "root",
				"admin");

		Statement stmt = conn.createStatement();
		
		
		String query = "select * from employee";
		
			ResultSet rs =	stmt.executeQuery(query);
			
			while(rs.next()) {
				
				
			int eid =	rs.getInt("eid");
						
			String ename = rs.getString("ename");
			
			double salary = rs.getDouble(3); // rs.getDouble("salary");
			
				
			System.out.println(eid +"  "+ename +" "+salary);
			
			}
			
			
		
		
		}catch (SQLException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
