package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Retrieve {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");  //step1
		
		//step 2
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","123456");
		
		//step3
		 Statement stmt=con.createStatement();
		 
		 ResultSet rs=stmt.executeQuery("select * from product2");     //added query to see the details of the product table
		 int id,quantity,price;
		 String name ;
		 System.out.println("Product Details");
		 System.out.println("----------------");
		 while(rs.next())
		 {
			 id=rs.getInt(1);
			 name=rs.getString(2);
			 quantity=rs.getInt(3);
			 price=rs.getInt(4);
			
			 System.out.println(id+"  "+name+"  "+quantity+"  "+price);			 
		 }
		 
		// TODO Auto-generated method stub
		 con.close();

	}

}
