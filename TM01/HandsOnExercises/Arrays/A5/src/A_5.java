
import java.util.Scanner;
public class A_5 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	int temp = 0;
	for(int j=0;j<n-1;j++)
	{
		for(int k=0;k<n-1-j;k++)
		{
			if(a[k]>a[k+1])
			{
				temp=a[k+1];
				a[k+1]=a[k];
				a[k]=temp;
			}
		}
	}
	for(int i=0;i<=1;i++)
	{
		System.out.print(a[n-i-1]+" ");
	}
	System.out.println();
	
	for(int i=0;i<=1;i++)
	{
		System.out.print(a[i]+" ");
	}
	}
}

