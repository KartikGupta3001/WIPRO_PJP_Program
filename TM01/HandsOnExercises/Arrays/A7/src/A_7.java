
import java.util.Scanner;
public class A_7 {
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
	for(int i=0;i<n;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	int l=0;
	int[] ar=new int[n];
	
		for(int j=0;j<n-1;j++)
		{
			if(a[j]!=a[j+1])
			{
				ar[l++]=a[j];
			}
		}
		ar[l++]= a[n-1];
	for(int i=0;i<l;i++)
	{
		System.out.print(ar[i]+" ");
	}
}
}