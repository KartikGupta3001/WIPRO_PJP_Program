import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DAOClass {
	private Connection conn = null;
	PreparedStatement psmt = null;
	
	public DAOClass() {
		conn=DBUtil.getConnection();
	}
	boolean insert(int rn,String n,String g,String dob,int fee)
	{
		String s = "INSERT INTO student VALUES(?,?,?,?,?)";
		try
		{			
			psmt=conn.prepareStatement(s);
			psmt.setInt(1,rn);
			psmt.setString(2, n);
			psmt.setString(3, g);
			psmt.setString(4,dob);
			psmt.setInt(5, fee);
			psmt.executeUpdate();
			return true;
		}
		catch(SQLException e)
		{
			return false;
		}	
	}
	boolean delete(int rn)
	{
		String s = "DELETE student WHERE rollno = ?";
		try
		{			
			psmt=conn.prepareStatement(s);
			psmt.setInt(1,rn);
			psmt.executeUpdate();
			return true;
		}
		catch(SQLException e)
		{
			return false;
		}
	}
	boolean modify(int rn,int fee)
	{
		String s = "UPDATE student SET fee=? WHERE rollno=?";
		try
		{			
			psmt=conn.prepareStatement(s);
			psmt.setInt(1,fee);
			psmt.setInt(2,rn);
			psmt.executeUpdate();
			return true;
		}
		catch(SQLException e)
		{
			return false;
		}
	}
	boolean display(int rn)
	{
		String s = "SELECT * FROM student WHERE rollno=?";
		try
		{
			psmt=conn.prepareStatement(s);
			psmt.setInt(1, rn);
			ResultSet rset = psmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			
			while(rset.next())
			{
				String s1="";
				for(int i=1;i<=rsmd.getColumnCount();i++)
				{
					String cn = rsmd.getColumnName(i);
					s1=s1+(rset.getObject(cn));
					if(i!=rsmd.getColumnCount())
						s1=s1+", ";
				}
				System.out.println(s1);
			}
			return true;
		}
		catch(SQLException e)
		{
			return false;
		}
	}
	boolean display()
	{
		String s = "SELECT * FROM student";
		try
		{
			psmt=conn.prepareStatement(s);
			ResultSet rset = psmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			
			while(rset.next())
			{
				String s1="";
				for(int i=1;i<=rsmd.getColumnCount();i++)
				{
					String cn = rsmd.getColumnName(i);
					s1=s1+(rset.getObject(cn));
					if(i!=rsmd.getColumnCount())
						s1=s1+", ";
				}
				System.out.println(s1);
			}
			return true;
		}
		catch(SQLException e)
		{
			return false;
		}
	}

}
