import java.util.Scanner;
public class A_2 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	int max=a[0],min=a[0];
	for(int j=0;j<n;j++)
	{
		if(a[j]>max)
		{
			max=a[j];
		}
	}
	System.out.println("Maximum is : "+max);
	for(int j=0;j<n;j++)
	{
		if(a[j]<min)
		{
			min=a[j];
		}
	}
	System.out.println("Minimum is : "+min);
}
}