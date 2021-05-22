import java.util.*;
public class S3 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	
	String str=s.substring(0, 2);
	String s1="";
	for(int i=0;i<s.length();i++)
	{
		s1+=str;
	}
	System.out.println(s1);
}
}
