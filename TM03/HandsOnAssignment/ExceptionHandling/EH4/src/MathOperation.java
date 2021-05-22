
import java.util.*;
public class MathOperation {
public static void main(String args[]) throws ArithmeticException,NumberFormatException
{
	
	try
	{
		if(args.length==5)
		{
		int[] a=new int[args.length];
		double s=0;
		double avg=0.0;
			for(int i=0;i<args.length;i++)
				a[i]=Integer.parseInt(args[i]);
			
			for(int i=0;i<args.length;i++)
				s+=a[i];
			avg=s/args.length;
			
			System.out.println(s);
			System.out.println(avg);
		}	
		else
			System.out.println("Enter 5 Integer Numbers");
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	catch(NumberFormatException e)
	{
		System.out.println(e);
	}
	
	
}
}
