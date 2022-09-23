package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

 public class StatementEx {
	Connection con;
	Statement stmt;
	ResultSet rs;

      public StatementEx() throws ClassNotFoundException,SQLException{
	 
    	 con = MyConnection.getMyConnection();
    	 System.out.println("Conncetion get open");
   }
   
     public void getData() throws SQLException
     {
    	 stmt = con.createStatement();
    	 rs = stmt.executeQuery("select * from employee");
    	 while(rs.next())
    	 {
    		 System.out.print(rs.getInt(1) + "\t");
    		 System.out.print(rs.getString(2) + "\t");
    		 System.out.print(rs.getFloat(3) + "\t");
    		 System.out.print(rs.getDate(4) + "\t");
    		 System.out.print(rs.getString(5) + "\t");
    		 System.out.print(rs.getString(6) + "\t");
    		 System.out.println(" ");
    		 
    	 }
    	 con.close();
     }
	
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
       StatementEx st = new StatementEx();
       st.getData();
	}

}
