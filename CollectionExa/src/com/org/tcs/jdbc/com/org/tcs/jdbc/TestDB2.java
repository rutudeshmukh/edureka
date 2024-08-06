package com.org.tcs.jdbc;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDB2 {

	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded...");
			//step 2
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tcsdb","root","Root123$");
			System.out.println("Connected...");
			
			//step 3 -used for taking input from user
			PreparedStatement ps = con.prepareStatement("update Student set name =?, fees=?, subject=? where id= ?");
			
			//step 4
			Scanner sc= new Scanner(System.in);
			
				System.out.println("Enter student id:");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter student name:");
				String name = sc.nextLine();
				System.out.println("Enter student fees:");
				int fees = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter student subject:");
				String subject = sc.nextLine();
				
				ps.setString(1,name);
				ps.setInt(2, fees);
				ps.setString(3, subject);
				ps.setInt(4,id);
				int i = ps.executeUpdate();
				System.out.println(i+" records affected");

		}catch(Exception e){
		System.out.println("Error: Unable to load driver class" + e);
		}
	}
}

