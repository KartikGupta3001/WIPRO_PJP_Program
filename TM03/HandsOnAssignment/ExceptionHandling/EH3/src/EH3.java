import java.util.*;
public class EH3 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements in the array : ");
	int n=sc.nextInt();
	System.out.println("Enter the elements in the array : ");
	int[] a = new int[n];
		
	try
	{
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("Enter the index of the element in the array you want to access : ");
		int m=sc.nextInt();
		System.out.println("The array element at index "+m+" is "+a[m]);
		System.out.println("The array element accessed successfully");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	catch(InputMismatchException f)
	{
		System.out.println("java.lang.NumberFormatException");
	}
}
}
