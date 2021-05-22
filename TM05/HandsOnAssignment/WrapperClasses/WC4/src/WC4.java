class Employee implements Cloneable
{
	String name;
	
	Employee(String n)
	{
		name=n;
	}
	Employee cloneTest()
	{
		try {
		return (Employee)  super.clone();}
		catch(CloneNotSupportedException e)
		{
			System.out.print("Cloning not allowed");
			return this;
		}
	}
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}
	String getName()
	{
		return name;
		
	}
}
public class WC4 {
public static void main(String args[])
{
	Employee e = new Employee("Kartik Gupta");
	Employee e1 = e.cloneTest();
	
	e1.setName("Harshit Gupta");
	System.out.print("Original Name : ");
	System.out.println(e.getName());
	System.out.print("Cloned Name : ");
	System.out.println(e1.getName());
}
}
