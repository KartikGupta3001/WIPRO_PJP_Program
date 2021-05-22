import java.util.*;
public class SET3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
			TreeSet<String> t = new TreeSet<String>();
			
			t.add("Kartik");
			t.add("Apple");
			t.add("Zebra");
			t.add("Mango");
			t.add("Praveen");
			
			Iterator i = t.iterator();
			System.out.println("Sorted Order : \n");
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			System.out.println();
			Iterator i1 = t.descendingIterator();
			System.out.println("Reverse Order : \n");
			while(i1.hasNext())
			{
				System.out.println(i1.next());
			}
			System.out.println();
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the String : ");
			String s = sc.nextLine();
			Iterator i2 = t.iterator();
			while(i2.hasNext())
			{
				if(i2.next().equals(s))
					{c=1;
					break;}
				else
					continue;
			}
			if(c==1)
				System.out.print("Exists");
			else
				System.out.println("Does Not Exists");
	}

}
