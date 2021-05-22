import java.util.*;
public class EH9 {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter First Number : ");
	int a = sc.nextInt();
	System.out.print("Enter Second Number : ");
	int b=sc.nextInt();
	try
	{
		System.out.println("The quotient of "+a+" / "+b+" = "+(a/b));
	}
	catch(ArithmeticException e)
	{
		System.out.println("DivideByZeroException caught");
	}
	finally
	{
		System.out.println("Inside finally block");
	}
}
}
