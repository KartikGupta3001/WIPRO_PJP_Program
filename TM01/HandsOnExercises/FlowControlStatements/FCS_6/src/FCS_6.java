
public class FCS_6 {
	public static void main(String args[])
	{
		int n1 = Integer.parseInt(args[1]);
		
		if(args[0].equals("Female"))
		{
			if(n1>=1 && n1<=58)
				System.out.println("Percentage of interest is 8.2%");
			else
				System.out.println("Percentage of interest is 9.2%");
		}
		else
		{
			if(n1>=1 && n1<=58)
				System.out.println("Percentage of interest is 8.4%");
			else
				System.out.println("Percentage of interest is 10.5%");
		}
	}
}
