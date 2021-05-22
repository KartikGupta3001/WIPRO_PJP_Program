import java.util.*;
public class FCS_3 {
	public static void main(String args[])
	{
		int len = args.length;
		
		if(len==0)
			System.out.println("No Values");
		else
			for(int i=0;i<len-1;i++)
			{
				System.out.print(args[i]+",");
			}
		System.out.print(args[len-1]);
			
	}
}
