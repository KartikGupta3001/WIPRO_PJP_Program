import java.util.*;
public class TM07Project_2 {

	LinkedList<String> l=new LinkedList<String>();
	void insert(String s)
	{
		l.add(s);
		System.out.println("Inserted Successfully");
	}
	void search(String s)
	{
		boolean c=false;
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			if(s.equals(i.next()))
				{System.out.println("Item Found in the List");
				c=true;
			break;}
			else
				continue;
		}
		if(c==false)
			System.out.println("No such item");
	}
	void delete(String s)
	{
		boolean c=false;
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			if(s.equals(i.next()))
				{i.remove();
				System.out.println("Item deleted successfully");
				c=true;
				break;}
			else
				continue;
		}
		if(c==false)
			System.out.println("Item does not exist");
	}
	void display()
	{
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TM07Project_2 o=new TM07Project_2();
		Scanner sc = new Scanner(System.in);
		String s;
		int n;
		boolean c=true;
		while(c)
		{
			System.out.println("1.Insert\n2.Search\n3.Delete\n4.Display\n5.Exit");
			System.out.println("Enter your choice : ");
			n=sc.nextInt();
			sc.nextLine();
			switch(n)
			{
			case 1:
				s=sc.nextLine();
				o.insert(s);
				break;
				
			case 2:
				s=sc.nextLine();
				o.search(s);
				break;
				
			case 3:
				s=sc.nextLine();
				o.delete(s);
				break;
				
			case 4:
				o.display();
				break;
				
			default:
				c=false;
				break;
			}
		}
		
		
	}

}
