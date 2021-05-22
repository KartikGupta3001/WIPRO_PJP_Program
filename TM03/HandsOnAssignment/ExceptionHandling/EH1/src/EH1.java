import java.util.*;
public class EH1 {
public static void main(String args[])
{
	String s=args[0];
	try
	{
		int i=Integer.parseInt(s);
		System.out.println(i*i);
		System.out.println("The work has been done successfully");
	}
	catch(NumberFormatException n)
	{
		System.out.println("Entered input is not a valid format for an Integer");
	}
}
}
