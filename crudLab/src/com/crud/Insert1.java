
//Using JDBC


package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert1 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		//we can add variables

		Class.forName("com.mysql.cj.jdbc.Driver"); 
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","123456");

		PreparedStatement ps=con.prepareStatement("insert into product2 values(?,?,?,?)");        //Query added to insert product details
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id of product");   //asking input to add product id
		int Product_Id=sc.nextInt();
		System.out.println("Enter the name of the product");    //product name
		String Product_Name=sc.next();
		System.out.println("Enter the price of the product");     //product price
		int Product_Price=sc.nextInt();
		System.out.println("Enter the quantity");      //product quantities
		int Product_Quantity=sc.nextInt();
				
		
		
		ps.setInt(1, Product_Id);
		ps.setString(2, Product_Name);
		ps.setInt(3, Product_Quantity);
		ps.setInt(4, Product_Price);
		
		int i=ps.executeUpdate();
		if(i>0) {
			System.out.println("Successfully product added");
			
		}
		else {
			System.out.println("Failed");
			
		}
		

	}

}


