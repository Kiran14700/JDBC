package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
         Class.forName("com.mysql.cj.jdbc.Driver");  //step1
		
		//step 2
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","123456");
		
		//step3
		 PreparedStatement pstmt=con.prepareStatement("Update product2 set Product_Name=?  where Product_Id=?");   //added query to update product table
		 
		 Scanner sc=new Scanner(System.in); 
		
		 
		 
		 System.out.println("Enter the product name you want to update");        //asking input to write the name of the product which he want to update
		 String name=sc.next();
		 
		 System.out.println("Enter the product id you want to change");          //asking input to enter the product id
		 int id=sc.nextInt();

		 
		 
		 
		 
		 pstmt.setString(1,name);
		 pstmt.setInt(2,id);
		
		 
		 int r=pstmt.executeUpdate();
		 con.close();
			
		 System.out.println("Record updated successfully" +r);
		 sc.close();
	}
	

}
