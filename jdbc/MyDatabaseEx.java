package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDatabaseEx {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
		//register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//establish Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdata","root","Pankaj8050");
		
		//create statement 
		Statement statement = con.createStatement();
		
		//execute statement
		ResultSet reSet = statement.executeQuery("select * from employee");
		
		//retrieve result
		while (reSet.next())
		{
		  System.out.print(reSet.getInt("emp_id")+ "\t");
		  System.out.print(reSet.getString("name")+ "\t");
		  System.out.print(reSet.getFloat("salary")+ "\t");
		  System.out.print(reSet.getDate("DOB")+ "\t");
		  System.out.print(reSet.getString("job")+ "\t");
		  System.out.print(reSet.getString("city")+ "\t");
		  System.out.println("");
		}
		
		//close Connection      
		statement.close();
		con.close();

	}
 }	
