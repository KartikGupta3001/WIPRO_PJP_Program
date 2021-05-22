import java.util.*;
public class S2 {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	String s="";
	if(s1.charAt(s1.length()-1) == s2.charAt(0))
	{
		s=s1.substring(0, s1.length()-1) + s2;
	}
	else
		s=s1+s2;
	
	System.out.println(s.toLowerCase());
}		
}
