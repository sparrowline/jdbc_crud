package com.jsp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionObj {
public static Connection getConnection() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//establish the connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud","root","root@123");
		
		//establish the statement// instead this we are using return statement to use it in dao/dato;
		return connection;
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	return null;
	
}
}

