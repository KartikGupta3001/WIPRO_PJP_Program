
import java.util.Scanner;
public class A_3 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Number of elements in an array : ");
	int n=sc.nextInt();
	
	System.out.print("Enter array elements : ");
	int[] a=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
		
	}
			
	System.out.println("Choose the number to check in array : ");
	int n1=sc.nextInt();
	
	int pos=0;
	for(int i=0;i<n;i++)
	{
		if(a[i]==n1)
		{
			pos = i+1;
		}
		else
			{continue;
			}
	}
	if(pos>0)
	System.out.println(pos-1);
	else
		System.out.println("-1");
	
}
}
