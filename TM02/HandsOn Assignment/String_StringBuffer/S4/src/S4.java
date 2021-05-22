import java.util.*;
public class S4 {
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	String s=sc.nextLine();
	String s1="";
	if(s.length()%2==0)
	{
		s1=s.substring(0, s.length()/2);
	}
	else
		System.out.println("Null");
	
	System.out.println(s1);
}
}
