package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//data access Layer
public class ConnectionDAL {

	
	private Connection connection;
	private DriverManager driverManager;
	
	public ConnectionDAL() {
		try {
		Class.forName("com.mysql.jdbc.Driver");}
		catch(ClassNotFoundException e) {
			
		}
		
	}
	
	public Connection getConnection() {
		try {
		connection=driverManager.getConnection("jdbc:mysql://localhost:3306/sunlifedb","root","Nte#25");
		}
		catch(SQLException e){
			
		
	}
		return connection;
	}
	
	
}
