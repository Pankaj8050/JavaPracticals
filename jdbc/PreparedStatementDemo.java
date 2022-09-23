package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {

	Connection connection;
	PreparedStatement pStatement;
	ResultSet rSet;
	public PreparedStatementDemo() throws ClassNotFoundException, SQLException{
		
		connection = MyConnection.getMyConnection();
		System.out.println("connection get open");
	}
	
	public void getDataBysalary(float min, float max) throws SQLException
	{
		
		pStatement = connection.prepareStatement("select * from employee where salary between ? and ?");
		pStatement.setFloat(1, min);
		pStatement.setFloat(2, max);
		rSet = pStatement.executeQuery(); //DRL
		
		while (rSet.next())
		{
			System.out.print(rSet.getInt(1) + "\t");
			System.out.print(rSet.getString(2) + "\t");
			System.out.print(rSet.getFloat(3) + "\t");
			System.out.print(rSet.getDate(4) + "\t");
			System.out.print(rSet.getString(5) + "\t");
			System.out.print(rSet.getString(6) + "\t");
			System.out.println( " ");
		}
	}
	
	public void insertRecords(int id,String name,String addr,float percentage,String email)throws SQLException
	{
		pStatement = connection.prepareStatement("insert into studentData values(?,?,?,?,?)"); 
		pStatement.setInt(1,id);
		pStatement.setString(2,name);
		pStatement.setString(3,addr);
		pStatement.setFloat(4,percentage);
		pStatement.setString(5,email);
		int n = pStatement.executeUpdate();
		System.out.println(n + "record is inserted");
		
		
		
	}
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter min and max range of salary");
		float min = scanner.nextFloat();
		float max = scanner.nextFloat();
		
		PreparedStatementDemo p1 = new PreparedStatementDemo();
		p1.getDataBysalary(min, max);
		//p1.insertRecords(11, "Pooja","Kochi", 70.55f, "pooja45@yahoo.in");
		
	}

}
