import java.util.*;
public class FCS_12 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		int count = 0;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
				{
					count = 1;
				}
			else
				continue;
		}
		if(count == 0)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
	}
}
