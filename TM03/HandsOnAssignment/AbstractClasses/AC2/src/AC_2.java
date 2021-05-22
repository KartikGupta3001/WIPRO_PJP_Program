import java.util.*;
abstract class Compartment
{
	abstract String notice();
}
class FirstClass extends Compartment
{
	@Override
	String notice()
	{
		return "You are in First Class Compartment";
	}
}
class Ladies extends Compartment
{
	@Override
	String notice()
	{
		return "You are in Ladies Compartment";
	}
}
class General extends Compartment
{
	@Override
	String notice()
	{
		return "You are in General Compartment";
	}
}
class Luggage extends Compartment
{
	@Override
	String notice()
	{
		return "You are in Luggage Compartment";
	}
}
public class AC_2 {

	public static void main(String args[])
	{
		Compartment[] comp=new Compartment[10];
		Random rand = new Random();
		
		
		for(int i=0;i<10;i++)
		{
			int n = rand.nextInt(4)+1;
			if(n==1)
				comp[i]=new FirstClass();
			else if(n==2)
				comp[i]=new Ladies();
			else if(n==3)
				comp[i]=new General();
			else if(n==4)
				comp[i]=new Luggage();
			
			System.out.println(comp[i].notice());
		}
		
		
	}
}
