
public class FCS_18 {
public static void main(String args[])
{
	int n = Integer.parseInt(args[0]);
	int num = n;
	int rem,sum=0;
	while(num!=0)
	{
		rem=num%10;
		num/=10;
		sum=sum*10+rem;
	}
	if(sum == n)
		System.out.println("Palindrome Number");
	else
		System.out.println("Not a Palindrome Number");
}
}
