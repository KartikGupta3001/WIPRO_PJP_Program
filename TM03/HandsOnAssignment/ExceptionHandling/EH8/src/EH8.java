import java.util.*;

class AgeException extends Exception
{
	AgeException()
	{
		System.out.println("AgeException occured");
		System.out.println("Age entered should be between 18 and 60");
	}
}
public class EH8 {
public static void main(String args[]) throws AgeException
{
	String s = args[0];
	int a = Integer.parseInt(args[1]);
	
	try
	{
		if(a>=18 && a<=60)
		{System.out.println("Name : "+s);
		System.out.println("Age : "+a);
		}
	else
		throw new AgeException();
	}
	catch(AgeException e)
	{
		System.out.println();
	}
}
}
