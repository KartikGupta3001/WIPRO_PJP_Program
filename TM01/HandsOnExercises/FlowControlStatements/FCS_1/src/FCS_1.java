
import java.util.*;
public class FCS_1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n>0)
			System.out.println("Number "+n+" is Positive");
		else if(n<0)
			System.out.println("Number "+n+" is Negative");
		else
			System.out.println("Number is Zero");
	}
}
