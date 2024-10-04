package com.student.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionUtil {
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/organizationdatabase";
    private static String username = "root";
    private static String password = "LocalHost@123";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException  {
		// 1.... loading the driver
		// every database has it's own driver
		Class.forName(driver);
		// Making connection to the driver
		Connection conn = DriverManager.getConnection(url, username, password);
		if (conn != null) {
			System.out.println("Db connection is established!!!!!!!!");
		}
		return conn;
	}
//JDBC Steps	
//load driver
//create connection
//create statement (Statement /prepareStatement)
//execute query
//close connection
}
