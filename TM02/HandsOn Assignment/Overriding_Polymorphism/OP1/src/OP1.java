class Fruit
{
	String name;
	String taste;
	String size;
	
	Fruit(String n,String t,String s)
	{
		name=n;
		taste=t;
		size=s;
	}
	
	void eat()
	{
		System.out.println("Name : "+name+", Taste : "+taste+", Size : "+size);
	}
}

class Apple extends Fruit
{
	Apple(String n, String t, String s) {
		super(n, t, s);
		
	}

	@Override
	void eat()
	{
		System.out.println("Name : "+name+", Taste : "+taste+", Size : "+size);
	}
	
}
class Orange extends Fruit
{
	Orange(String n, String t, String s) {
		super(n, t, s);
		
	}

	@Override
	void eat()
	{
		System.out.println("Name : "+name+", Taste : "+taste+", Size : "+size);
	}
}
public class OP1 {
public static void  main(String args[])
{
	Apple a = new Apple("Apple", "Sweet", "Medium");
	Orange o = new Orange("Orange","Sour","Medium");
	
	a.eat();
	o.eat();
}
}
