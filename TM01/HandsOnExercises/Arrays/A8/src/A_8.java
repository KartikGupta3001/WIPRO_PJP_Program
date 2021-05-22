

	import java.util.Scanner;
	public class A_8{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int c=0,s=0,j=0,s1=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			if(a[i]!=6)
				s=s+a[i];
			else
			{
				for(j=i;j<n;j++,i++)
				{
					s1=s1+a[j];
					if(a[j]==7)
						{c++;
						break;
						}
				}
				if(c==0)
					s=s+s1;
				s1=0;
			}}
			
		System.out.println(s);
		}}
