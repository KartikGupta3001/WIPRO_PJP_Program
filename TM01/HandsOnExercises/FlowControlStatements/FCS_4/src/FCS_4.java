import java.util.*;
public class FCS_4 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char a = sc.nextLine().charAt(0);
		char b = sc.nextLine().charAt(0);
		
		int a1 = (int)a;
		int b1 = (int)b;
		
		if(a1<b1)
			System.out.println(a+","+b);
		else
			System.out.println(b+","+a);
	}
}
