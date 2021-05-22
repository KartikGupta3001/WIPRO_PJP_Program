import java.util.Iterator;
import java.util.Vector;
public class L6 {
public static void main(String args[])
{
	Vector<String> al=new Vector<String>();
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
