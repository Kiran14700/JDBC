//WAP to perform CRUD operation on Product database based on choice given by user using switch case.
package com.crud;

//packages imported
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create1 {

	public static void main(String[] args) throws ClassNotFoundException,SQLException   //ClassNotFoundException,SQLException
    //write in main string to avoid exception
{

Class.forName("com.mysql.cj.jdbc.Driver");      //JDBC driver added

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "123456");      //localhost server added and database name ,sql server username ,passwrord

Statement stmt= con.createStatement();

String s = "CREATE TABLE Product2" +                //Queries added to create table and add fields
"(Product_ID INT , " +
" Product_Name VARCHAR(255), " + 
" Product_Quantiy int, " + 
" Product_Price INT) ";	
int a=stmt.executeUpdate(s);


System.out.println("Sucessfully created table " +a);
con.close();}

}
