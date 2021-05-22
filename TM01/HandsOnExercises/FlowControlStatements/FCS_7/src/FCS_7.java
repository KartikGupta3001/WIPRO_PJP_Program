import java.util.*;
public class FCS_7 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);
		
		int ch1 = (int)ch;
		
		if(ch1>=97 && ch1<=120 || ch1>=65 && ch1<=90)
		{
			if(ch1>=97 && ch1<=120)
			{
				ch1 = ch1-32;
				char ch2 = (char)ch1;
				System.out.println(ch2);
			}
			else
			{
				ch1 = ch1+32;
				char ch2 = (char)ch1;
				System.out.println(ch2);
			}
		}
		else
			System.out.println("Not an Alphabet");
	}
}
