import java.util.*;
class NegativeValuesException extends Exception
{
	NegativeValuesException()
	{
		System.out.println("Negative Values Exception occured");
	}
}
class OutOfRangeException extends Exception
{
	OutOfRangeException()
	{
		System.out.println("OutOfRangeException occured");
	}
}

public class EH6 {

public static void main(String args[]) throws NumberFormatException
{
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<2;i++)
	{
		System.out.println("Enter Name : ");
		String s= sc.next();
		sc.nextLine();
		System.out.println("Enter marks for student : "+i+" "+s);
		int avg=0;
		int a=0,b=0,c=0;
		
	try
	{
		for(int j=1;j!=0;j=0)
		{		
			if(sc.hasNextInt()) 
				a=sc.nextInt();
			else
				throw new NumberFormatException();
			if(sc.hasNextInt()) 
				b=sc.nextInt();
			else
				throw new NumberFormatException();
			if(sc.hasNextInt()) 
				c=sc.nextInt();
			else
				throw new NumberFormatException();
		}
	
	if(a<0) throw new NegativeValuesException();
	if(a>100) throw new OutOfRangeException();
	
	if(b<0) throw new NegativeValuesException();
	if(b>100) throw new OutOfRangeException();
	
	if(c<0) throw new NegativeValuesException();
	if(c>100) throw new OutOfRangeException();
	
	avg = (a+b+c)/3;
	
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	catch(NegativeValuesException e)
	{
		System.out.println(e);
	}
	catch(OutOfRangeException e)
	{
		System.out.println(e);
	}
	System.out.println("Name : "+s);
	System.out.println("Marks are : "+a+" "+b+" "+c);
	System.out.println("Average is : "+avg);
	}
}
}
