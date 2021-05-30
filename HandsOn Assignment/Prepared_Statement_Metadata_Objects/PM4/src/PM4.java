import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PM4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		String query = "";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		int rn = Integer.parseInt(args[0]);
		double fee = Double.parseDouble(args[1]);
		
		try {			
			query = "UPDATE stdnt SET fees = ? WHERE rollno = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setDouble(1, fee);
			pstmt.setInt(2, rn);
			
			if (pstmt.executeUpdate() == 1)
				System.out.println("Fees of student having rollno = " + rn + " updated successfully");
			else
				System.out.println("Error");
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		sc.close();
	}

}
