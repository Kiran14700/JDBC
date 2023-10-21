package com.crud;

//packages imported
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Delete {
	public static void main(String[] args) throws Exception       //use throws to avoid exception
	{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");            
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","123456");    //localhost server added
		PreparedStatement ps=con.prepareStatement("delete from product2 where product_id=?");        //stqtement(query) entered
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Product_id you want to delete");            //asking input to enter the id of prduct that he want to delete
		int id=sc.nextInt();
		ps.setInt(1, id);
		int i=ps.executeUpdate();
		
		if (i>0){
			System.out.println("Successfully deleted");
		}
		else {
			System.out.println("enter id is not in db");
			
		}
		
		
		

	}
}
