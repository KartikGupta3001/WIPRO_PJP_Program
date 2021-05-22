import java.util.*;

class Employee
{
	String fn;
	String ln;
	long m;
	String em;
	String ad;
	void setFirst(String fn)
	{
		this.fn=fn;
	}
	void setLast(String ln)
	{
		this.ln=ln;
	}
	void setMobile(long m)
	{
		this.m=m;
	}
	void setMail(String em)
	{
		this.em=em;
	}
	void setAddress(String ad)
	{
		this.ad=ad;
	}	
	String getFirst()
	{
		return fn;
	}
	String getLast()
	{
		return ln;
	}
	long getMobile()
	{
		return m;
	}
	String getMail()
	{
		return em;
	}
	String getAddress()
	{
		return ad;
	}
	
	public String toString()
	{
		return getLast() + "\t\t" + getMobile() + "\t" + getMail() + "\t\t" + getAddress();
	}
}
public class TM07Project_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String fname,lname,mail,add;
		long mob;
		TreeMap<String,Employee> t=new TreeMap<String,Employee>();
		System.out.println("Enter the number of Employees : ");
		int n=sc.nextInt();
		Employee[] e=new Employee[n];
		for(int i=0;i<n;i++)
		{
			e[i]=new Employee();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Employee "+(i+1)+" details");
			System.out.println("Enter the Firstname : ");
			fname=sc.next();
			System.out.println("Enter the Lastname : ");
			lname=sc.next();
			System.out.println("Enter the Mobile Number : ");
			mob=sc.nextLong();
			System.out.println("Enter the Mail : ");
			mail=sc.next();
			System.out.println("Enter the Address : ");
			add=sc.next();
			
			System.out.println();
			
			e[i].setLast(lname);
			e[i].setMobile(mob);
			e[i].setMail(mail);
			e[i].setAddress(add);
			t.put(fname, e[i]);
		}
		
		System.out.format("%-15s %-15s %-15s %-30s %-15s\n","Firstname","Lastname","Mobile","Email","Address");
			
		Set set=t.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext())
		{
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey()+"\t\t"+me.getValue());
		}
	}

}
