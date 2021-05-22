import java.util.*;
public class WC3 {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number between 1 to 255 : ");
	int i = sc.nextInt();
	System.out.println((String.format("%8s", Integer.toBinaryString(i))).replace(' ','0'));
	
}
}
