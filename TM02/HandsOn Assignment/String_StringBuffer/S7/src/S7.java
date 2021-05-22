import java.util.*;
public class S7 {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	String s=sc.nextLine();
	String s1="";
	if(s.charAt(0) == 'x' || s.charAt(0) == 'X' && s.charAt(s.length()-1) == 'x'|| s.charAt(s.length()-1) == 'X')
	{
		s1=s.substring(1, s.length()-1);
		System.out.println(s1);
	}
	else
		System.out.println(s);
}
}
