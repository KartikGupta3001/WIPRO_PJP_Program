import java.util.LinkedList;
import java.util.Iterator;
public class L5 {
public static void main(String args[])
{
	LinkedList<String> al=new LinkedList<String>();
	al.add("January");
	al.add("February");
	al.add("March");
	al.add("April");
	al.add("May");
	al.add("June");
	al.add("July");
	al.add("August");
	al.add("September");
	al.add("October");
	al.add("November");
	al.add("December");
	
	Iterator<String> i = al.iterator();
	
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
}
