package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.CallableStatement;

public class CallableStatementEx {

	Connection connection;
	CallableStatement cStatement;
	
	public CallableStatementEx() throws ClassNotFoundException , SQLException{
		
	    connection = MyConnection.getMyConnection();
	    System.out.println("Connection got open");
	    
	}
	
	public void callingProcedure(int id, String name) throws SQLException
	{
		cStatement = connection.prepareCall("{call insertUserRecord(?,?)}");
		cStatement.setInt(1, id);
		cStatement.setString(2, name);
		cStatement.execute();
		System.out.println("inserted succesfully");
		
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
       CallableStatementEx obj = new CallableStatementEx();
       obj.callingProcedure(112, "saloni");
       
       
	}

}
