import java.util.*;
class Employee
{
	int id;
	String name;
	String des;
	float salary;
	
	Employee(int ID,String n,String d,float s)
	{
		id=ID;
		name=n;
		des=d;
		salary=s;
	}
	int getID()
	{
		return id;
	}
	String getName()
	{
		return name;
	}
	String getDes()
	{
		return des;
	}
	float getSalary()
	{
		return salary;
	}
	public String toString()
	{
		return ("Employee [EmpId=" + id + ", EmpName=" + name + ", EmpDes=" + des
				+ ", EmpSalary=" + salary + "]");
	}
}
public class L7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Vector<Employee> v=new Vector<Employee>();
			
			Employee m1=new Employee(20732025, "Kartik Gupta", "Software Engineer", 650000);
			Employee m2=new Employee(20732026, "Harshit Gupta", "Student", 550000);
			Employee m3=new Employee(20732027, "Praveen Gupta", "Businessman", 1050000);
			Employee m4=new Employee(20732028, "Abha Gupta", "HouseWife", 750000);
			
			v.add(m1);
			v.add(m2);
			v.add(m3);
			v.add(m4);
	
			Iterator<Employee> it=v.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
	}

}
