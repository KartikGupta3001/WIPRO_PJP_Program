import java.util.*;
public class S10 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int n = sc.nextInt();
	
	String s1="";
	for(int i=0;i<n;i++)
	{
		s1+=s.substring(n-1,s.length());
	}
	System.out.println(s1);
}
}
