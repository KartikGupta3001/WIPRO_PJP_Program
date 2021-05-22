//import java.util.*;
public class FCS_14 {
public static void main(String args[])
{	
	
	if(args.length==0)
	{
		System.out.println("Please enter an Integer number");
	}
	else
	{
		int n = Integer.parseInt(args[0]);
		int count = 0;
		
		if(n==0 || n==1)
			System.out.println(n+" is neither prime nor composite");
		else
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
					{count=1;}
				else
					continue;
			}
			if(count==0)
				System.out.println(n+" is a Prime Number");
			else
				System.out.println(n+" is not a Prime Number");
	}
}
}}
