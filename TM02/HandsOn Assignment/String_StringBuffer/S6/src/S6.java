import java.util.*;
public class S6 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	String s="";
	
	if(s1.length()<s2.length())
		{s=s1+s2+s1;
		System.out.println(s);}
	else
		System.out.println("Length of String 1 should be less than String 2");
}
}
