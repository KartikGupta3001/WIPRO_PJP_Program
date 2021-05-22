import java.util.*;
public class S8 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String s1="";
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='*')
		{
			s1=s.substring(0, i-1)+s.substring(i+2, s.length());
			System.out.println(s1);
			break;
		}
		else
			continue;
	}
}
}
