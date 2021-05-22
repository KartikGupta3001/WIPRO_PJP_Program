import java.util.*;
public class Test {
	static HashSet<Box> h=new HashSet<Box>(); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Box");
		int n=sc.nextInt();
		Box[] b=new Box[n];
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Box "+(i+1)+" details");
			System.out.println("Enter Length");
			double length = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter Width");
			double width = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter Height");
			double height = sc.nextDouble();
			b[i]=new Box(length,width,height);
			boolean flag=false;
			if(i==0)
				h.add(b[i]);
			else
			{
				for(Box o:h)
				{
					if(o.getVol() == (length*width*height))
					{	flag=true;
					break;}
					}
				
				if(flag==false)
					h.add(b[i]);
				}
			}
		Iterator i = h.iterator();
		System.out.println("Unique Boxes in the Set are ");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		}
	}


