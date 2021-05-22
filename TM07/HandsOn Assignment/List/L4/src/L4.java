import java.util.*;
class Arraylist<A> extends ArrayList<A> 
{
	@Override
	public boolean add(A e)
	{
		if(e instanceof Integer || e instanceof Float || e instanceof Double)
		{
			super.add(e);
			return true;
		}
		else
			throw new ClassCastException("Only Integer, Float and Double values accepted");
		
	}
}

public class L4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraylist<Object> list = new Arraylist<Object>();
		
		try
		{
			list.add(8);
			list.add(7.98F);
			list.add(4.787D);
			//list.add("Java");
		}
		catch(Exception e)
			{System.out.println(e);}
		
		System.out.println(list);
	}
}
