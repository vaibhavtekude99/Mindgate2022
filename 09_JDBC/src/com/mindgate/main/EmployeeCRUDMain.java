package com.mindgate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeCRUDMain {

	public static void main(String[] args) {

		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String password="mindgate123";
		String driver="oracle.jdbc.driver.OracleDriver";
		String sqlQuery="";
		int result=0;
		
		
		Connection connection;
		Statement statement;
		
		System.out.println("Insert Example");
		
		
		try {
			Class.forName(driver);
			connection=DriverManager.getConnection(url,user,password);
			statement= connection.createStatement();
			sqlQuery="INSERT INTO employee_details (name,salary) values ('tendulkar',49999)";
			result=statement.executeUpdate(sqlQuery);
			if(result>0)
			{
				System.out.println("Inserted successfully");
			}
			else
			{
				System.out.println("Unable to inserted");
			}
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Exceptoion occur");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
	}

}
