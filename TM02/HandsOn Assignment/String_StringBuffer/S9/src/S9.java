import java.util.*;
public class S9 {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	String a = sc.nextLine();
	String b=sc.nextLine();
	String s="";
	if(a.length()<b.length())
	{
		for(int i=0;i<a.length();i++)
		{
			s+=a.charAt(i);
			s+=b.charAt(i);
		
		}
		s+=b.substring(a.length(),b.length());
		System.out.print(s);
	}
	else if(a.length()==b.length())
	{
		for(int i=0;i<a.length();i++)
		{
			s+=a.charAt(i);
			s+=b.charAt(i);
		
		}
		System.out.print(s);
	}
	else
	{

		for(int i=0;i<b.length();i++)
		{
			s+=a.charAt(i);
			s+=b.charAt(i);
		}
		s+=a.substring(b.length(),a.length());
		System.out.print(s);
	}
}
}
