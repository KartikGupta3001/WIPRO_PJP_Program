package Input;
import java.util.*;
import java.io.*;
public class Employee implements  Serializable{
	String name;
	String department;
	String dob;
	String designation;
	double salary;
	
	void setName(String n)
	{
		name=n;
	}
	String getName()
	{
		return name;
	}
	void setDepartment(String dp)
	{
		department=dp;
	}
	String getDepartment()
	{
		return department;
	}
	void setDob(String db)
	{
		dob=db;
	}
	String getDob()
	{
		return dob;
	}
	void setDesignation(String dg)
	{
		designation=dg;
	}
	String getDesignation()
	{
		return designation;
	}
	void setSalary(double s)
	{
		salary=s;
	}
	double getSalary()
	{
		return salary;
	}
	
	public static void main(String args[]) throws IOException,ClassNotFoundException
	{
		Scanner sc=new Scanner(System.in);
		Employee e = new Employee();
		
		System.out.print("Enter name : ");
		e.setName(sc.nextLine());
		System.out.print("Enter Department : ");
		e.setDepartment(sc.nextLine());
		System.out.print("Enter Date of Birth : ");
		e.setDob(sc.nextLine());
		System.out.print("Enter Designation : ");
		e.setDesignation(sc.nextLine());
		System.out.print("Enter Salary : ");
		e.setSalary(sc.nextDouble());
		
		FileOutputStream out=new FileOutputStream("data");
		ObjectOutputStream oos=new ObjectOutputStream(out);
		oos.writeObject(e);
		
		FileInputStream in=new FileInputStream("data");
		ObjectInputStream ois=new ObjectInputStream(in);
		Employee e1 = (Employee) ois.readObject();
		
		System.out.println();
		System.out.println("Name: " + e1.getName());
		System.out.println("D.O.B.: " + e1.getDob());
		System.out.println("Department: " + e1.getDepartment());
		System.out.println("Designation: " + e1.getDesignation());
		System.out.println("Salary: " + e1.getSalary());
		
		out.close();
		oos.close();
		in.close();
		ois.close();
		
	}
}
