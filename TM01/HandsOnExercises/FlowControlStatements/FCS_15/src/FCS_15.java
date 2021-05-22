import java.util.*;
public class FCS_15 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
	int rem,sum=0;
	for(int i=1;i<=n;n/=10)
	{
		rem = n%10;
		sum = sum+rem;
	}
	System.out.println(sum);
}
}
