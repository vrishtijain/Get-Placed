/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.sql.*;
public class Event1
{
public static void main(String args[])
{
    String url;
    url = "jdbc:mysql://localhost:3306/db1";
 try{
   Class.forName("com.mysql.jdbc.Driver");
   System.out.println("Driver loaded successfully...!!");
   Connection con;
       
  con = DriverManager.getConnection(url,"root","abc123");
   System.out.println("Connection Successful...!!");
   
   
    }
 
 catch(ClassNotFoundException | SQLException e)
 {
     System.out.println("Connection  not Successful...!!");
 }	
}
}

