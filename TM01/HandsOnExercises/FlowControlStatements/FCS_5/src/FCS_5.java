import java.util.*;
public class FCS_5 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);
		
		int ch1 = (char)ch;
		
		if((ch1>=65 && ch1<=90) || (ch1>=97 && ch1<=120)) 
			System.out.println(ch1+" is an Alphabet");
		else if(ch1>=48 && ch1<=57)
			System.out.println(ch1+" is a Digit");
		else
			System.out.println(ch1+" is a Special Character");
	}
}
