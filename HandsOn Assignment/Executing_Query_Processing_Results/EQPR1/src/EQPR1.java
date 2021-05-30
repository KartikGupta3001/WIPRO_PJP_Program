import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EQPR1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn  = null;
		Statement stmt = null;
		ResultSet rset;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			System.out.println("Connection Established successfully");
		}
		catch(Exception e)
		{
			System.out.println("Connection could not be Establised");
			e.printStackTrace();
			if(conn!=null)
				conn.close();
		}
		String query = "SELECT employee_id,first_name FROM employees";
		stmt = conn.createStatement();
		rset = stmt.executeQuery(query);
		
		while(rset.next())
		{
			System.out.println("Employee ID : "+rset.getInt("employee_id")+", First Name : "+rset.getString("first_name"));
		}
		
		if(stmt!=null)
			stmt.close();
		if(rset!=null)
			rset.close();
	}

}
