package com.visog.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.viosg.digital.constants.Properties;

public class Database {

	 public static Connection getConnection(){
		 try {
			Class.forName(Properties.DRIVER);
			Connection con = DriverManager.getConnection(Properties.URL,Properties.USER_NAME,Properties.PASS);
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
