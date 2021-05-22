import java.util.*;
public class A_1 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	int sum=0,avg=0;
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int j=0;j<n;j++)
	{
		sum+=a[j];
	}
	
	avg = sum/a.length;
	
	System.out.println("Sum : "+sum);
	System.out.print("Average : "+avg);
}
}
