public class FCS_19 {
public static void main(String args[])
{
	int i=1,n=1;
	while(i<=5)
	{
		if(n%2==0 && n%3==0 && n%5==0)
		{
			System.out.print(n+" ");
			i++;
		}
		n++;
	}
	
}
}
