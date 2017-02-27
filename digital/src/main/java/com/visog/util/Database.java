package com.visog.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	 public static Connection getConnection(){
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname","root","root");
			return con;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}   
	 public static void close(Connection con){
		 try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 }
	 
}
