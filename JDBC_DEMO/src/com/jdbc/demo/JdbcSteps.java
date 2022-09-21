package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSteps {

	public static void main(String[] args) {

		Connection conn = null;
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/starhealth_db", "root",
					"admin");

			Statement stmt = conn.createStatement();
			// insert query
			//String query = "insert into employee values(106,'anil',35000,'Trainer',current_date,null)";
			
			//update query
			
	//	String query ="update employee set ename = 'Anil Kumar',salary = 50000,job='manager',doj=current_date-1,comm=300 where eid = 106 ";	
		
			
			// delete query 
			
			String query = "delete from employee where eid =105";
			
			int count = stmt.executeUpdate(query);
			
			
			System.out.println(count+" record effected");

		} catch (SQLException e) {
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
