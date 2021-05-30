import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EQPR2 {

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
		String query = "SELECT first_name,job_id,salary,commission_pct FROM employees WHERE salary>1000 AND salary<2000";
		stmt = conn.createStatement();
		rset = stmt.executeQuery(query);
		System.out.printf("%-10S%-10S%10S%10S\n","ename","job","sal","comm");
		while(rset.next())
		{
			System.out.printf("%-10S%-10S%10S%10S\n",  rset.getString("first_name"),rset.getString("job_id"),rset.getInt("salary"),rset.getInt("commission_pct"));
		}
		
		if(stmt!=null)
			stmt.close();
		if(rset!=null)
			rset.close();
	}

}
