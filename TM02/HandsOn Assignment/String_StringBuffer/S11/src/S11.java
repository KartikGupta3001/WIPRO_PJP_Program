import java.util.*;
public class S11 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	String s="";
	while(s1.contains(s2))
	{
		int l=s1.indexOf(s2);
	//	int l1=s1.lastIndexOf(s2);
		
		s+=s1.charAt(l-1);
		s+=s1.charAt(l+s2.length());
			
		s1=s1.substring(l+s2.length(),s1.length());
		System.out.print(s);
		s="";

}}}
