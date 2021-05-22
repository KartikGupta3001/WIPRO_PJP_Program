import java.util.*;
public class TM07Project_4 {

	TreeMap<String,ArrayList<Integer>> t = new TreeMap<String,ArrayList<Integer>>();
	static String s;
	static int number;
	void add(String s,int number)
	{
		if(t.containsKey(s))
			t.get(s).add(number);
		else
			{t.put(s,new ArrayList<Integer>());
			t.get(s).add(number);
			}
	}
	void display()
	{
		int counter=0;
		System.out.println("Distinct Symbols are : ");
		Set set=t.entrySet();
		Iterator i =set.iterator();
		
		while(i.hasNext())
		{
			Map.Entry m = (Map.Entry)i.next();
			System.out.print(m.getKey()+"	");
		}
		
		System.out.println();
		Iterator i1 = set.iterator();
		
		while(i1.hasNext())
		{
			counter=0;
			Map.Entry m = (Map.Entry)i1.next();
			System.out.println("Cards in "+m.getKey()+" Symbol");
			ArrayList<Integer> v = (ArrayList<Integer>)m.getValue();
			for(int a:v)
			{
				counter++;
				System.out.println(m.getKey()+" "+a);
			}
			System.out.println("Number of Cards : "+counter);
			int s=0;
			for(int a:v)
			{
				s+=a;
			}
			System.out.println("Sum of Numbers : "+s);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TM07Project_4 o = new TM07Project_4();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Cards:");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter card "+i);
			s=sc.nextLine();
			number=sc.nextInt();
			sc.nextLine();
			o.add(s, number);
		}
		o.display();
	}

}
