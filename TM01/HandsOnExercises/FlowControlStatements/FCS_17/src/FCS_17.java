import java.util.*;
public class FCS_17 {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i;
	int num=n;
	int rem;
	int sum=0;
	while(num!=0) //1234
	{
		rem=num%10;
		num/=10;
		sum=sum*10 + rem;
	}
	n=sum;
	System.out.println(n);
}
}
