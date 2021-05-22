
public class A_10 {
public static void main(String args[])
{
	
	int n=3;
	int[][] a=new int[n][n];
	if((args.length)==9)
	{
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
			{
				a[i][j]=Integer.parseInt(args[3*i+j]);
			}
	}
	int max=a[0][0];
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
			{
				if(a[i][j]>max)
					max=a[i][j];
			}
	}
		System.out.println(max);
	}
	else
		System.out.print("Please enter 9 integer numbers");
	
}
}