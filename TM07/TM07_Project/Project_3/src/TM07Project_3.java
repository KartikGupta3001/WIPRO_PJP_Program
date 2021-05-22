import java.util.*;
public class TM07Project_3 {
	
	static String s;
	static int number;
	TreeSet<String> t = new TreeSet<String>();
	ArrayList<Integer> al=new ArrayList<Integer>(Collections.nCopies(60, 4));
	int flag=97;
	int counter=0;
	Character ch=(char)flag;
	void add(String s,int number,int n)
	{
		this.s=s;
		this.number=number;
		if(t.add(s)==true)
		{
			if(s.equals("a"))
				al.add(0, number);
			if(s.equals("b"))
				al.add(1, number);
			if(s.equals("c"))
				al.add(2, number);
			if(s.equals("d"))
				al.add(3, number);	
		}
		Iterator<String> i = t.iterator();
		while(i.hasNext())
		{
			if(ch.toString().equals(i.next()))
			{
				counter++;
				ch=(char)(++flag);
			}
		}
		if(counter==4)
			display(n);
	}
	void display(int n)
	{
		System.out.println("Four symbols gathered in " +n+ " cards.");
		System.out.println("Cards in Set are: ");
		Iterator<String> i =t.iterator();
		Iterator<Integer> j = al.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+"\t");
			System.out.println(j.next());
		}
		System.exit(0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TM07Project_3 o = new TM07Project_3();
		Scanner sc=new Scanner(System.in);
		int n=0;
		while(true)
		{
			++n;
			System.out.println("Enter a Card : ");
			s=sc.nextLine();
			number = sc.nextInt();
			sc.nextLine();
			o.add(s, number, n);
		}
				
	}

}
