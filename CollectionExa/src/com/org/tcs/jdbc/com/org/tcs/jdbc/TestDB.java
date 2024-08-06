package com.org.tcs.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDB {
//	private static final String URL = "jdbc:mysql://localhost:3306/tcsdb";
//	private static final String USER = "root";
//	private static final String PASSWORD = "Root123$";
//	
//	public static Connection getConnection() throws SQLException{
//		return DriverManager.getConnection(URL, USER, PASSWORD);
//	}
	public static void main(String[] args) {
		
//		try(Connection connection = getConnection()){
//			if(connection != null) {
//				System.out.println("Connected to the database.");
//			}
//		} catch(SQLException e) {
//			e.printStackTrace();
//		}
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded...");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tcsdb","root","Root123$");
			System.out.println("Connected...");
			
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("Select * from Student");
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			con.close();
		}catch(Exception e){
		System.out.println("Error: Unable to load driver class" + e);
		}
	}
}
