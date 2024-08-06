package com.org.tcs.jdbc;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDB1 {

	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded...");
			//step 2
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tcsdb","root","Root123$");
			System.out.println("Connected...");
			
			//step 3 -used for taking input from user
			PreparedStatement ps = con.prepareStatement("Insert into Student values(?,?,?,?)");
			
			//step 4
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter number of rows you want to enter:");
			int count = sc.nextInt();
			while(count!=0){
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
				count--;
				
				ps.setInt(1,id);
				ps.setString(2,name);
				ps.setInt(3, fees);
				ps.setString(4, subject);
				int i = ps.executeUpdate();
				System.out.println(i+" records affected");
//				System.out.println("Do you want to continue: y/n ");
//				String s = sc.nextLine();
//				if(s.startsWith("n")) {
//					break;
//				}
				
			};

		}catch(Exception e){
		System.out.println("Error: Unable to load driver class" + e);
		}
	}
}

