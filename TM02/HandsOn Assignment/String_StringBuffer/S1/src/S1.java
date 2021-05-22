import java.util.*;
public class S1 {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	String s=sc.nextLine();
	String rev="";
	for(int i = s.length()-1;i>=0;i--)
	{
		rev+=s.charAt(i);
	}
	if(rev.equalsIgnoreCase(s))
	{
		System.out.println("Palindrome String");
	}
	else
		System.out.println("Not a Palindrome String");
}
}
