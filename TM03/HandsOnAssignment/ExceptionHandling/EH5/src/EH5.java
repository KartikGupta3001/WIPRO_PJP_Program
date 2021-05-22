import java.util.*;
public class EH5 {
public static void main(String args[]) throws ArithmeticException
{
	Scanner sc = new Scanner(System.in);
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	
	try
	{
		double div = n1/n2;
		System.out.println(div);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
}
}
