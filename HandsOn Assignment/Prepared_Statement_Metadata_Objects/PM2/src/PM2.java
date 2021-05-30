import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class PM2 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
			Connection conn = null;
			PreparedStatement psmt = null;
			Scanner sc= new Scanner(System.in);
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			int rn=0;
			while(rn==0)
			{
				System.out.println("Enter Roll Number : ");
				rn=sc.nextInt();
				try
				{
					if(String.valueOf(rn).length()!=4)
					{
						rn=0;
					}
				}
				catch(Exception e){}
			}
			sc.nextLine();
			String n="";
			boolean lowercase=false;
			while(n.length()> 20 || (!lowercase))
			{
				System.out.println("Enter Name : ");
				n=sc.nextLine();
				for(int i=0;i<n.length();i++)
				{
					if(Character.isLowerCase(n.charAt(i)))
					{
						lowercase=true;
						break;
					}
				}
			}
			
			String standard = "";
			String[] standards = {"I", "II", "III", "IV", "V", "Vi", "VII", "VIII", "IX", "X"};
			List<String> list = new ArrayList<>(Arrays.asList(standards));
			do {
				System.out.print("Enter standard: ");
				standard = sc.nextLine();
			} while (!list.contains(standard));
			System.out.print("Enter D.O.B.: ");
			String dob = sc.nextLine();
		
			double fee=0.0;
			while(fee==0.0)
			{
				System.out.println("Enter fees : ");
				fee = sc.nextDouble();
			}
			
			String query = "INSERT INTO stdnt VALUES(?,?,?,?,?)";
			try
			{
				psmt = conn.prepareStatement(query); 
				psmt.setInt(1, rn);
				psmt.setString(2,n);
				psmt.setString(3,standard);
				psmt.setString(4, dob);
				psmt.setDouble(5, fee);
				psmt.executeQuery();
				System.out.println("Student Added Successfully");
			}
			catch(SQLException e)
			{
				e.printStackTrace();
				System.out.println("Error");
				conn.close();
				psmt.close();
			}
	}
}
