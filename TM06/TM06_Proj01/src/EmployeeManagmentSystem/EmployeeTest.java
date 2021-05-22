package EmployeeManagmentSystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EmployeeTest {
	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		Scanner sc=new Scanner(System.in);
		
		FileOutputStream out=new FileOutputStream("data");
		ObjectOutputStream oos=new ObjectOutputStream(out);
		
		
		FileInputStream in=new FileInputStream("data");
		ObjectInputStream ois=new ObjectInputStream(in);
		
		
		int c=0;
		
		while(c!=3)
		{
			System.out.println("Main Menu : ");
			System.out.println("1. Add an Employee");
			System.out.println("2. Display All");
			System.out.println("3. Exit");
			System.out.println();
			System.out.print("Enter your choice : ");
			c=sc.nextInt();
			sc.nextLine();
			
			switch(c)
			{
			case 1:
				Employee e = new Employee();
				System.out.println();
				System.out.print("Enter name : ");
				e.setName(sc.nextLine());
				System.out.print("Enter Employee ID : ");
				e.setEmpID(sc.nextLine());
				System.out.print("Enter Age : ");
				e.setAge(sc.nextInt());
				System.out.print("Enter Salary : ");
				e.setSalary(sc.nextDouble());
				
				oos.writeObject(e);
				
				break;
				
			case 2:
				System.out.println();
				System.out.println("---------Report---------");
				
				while(in.available()>0)
				{
				Employee e1 = (Employee) ois.readObject();
				System.out.println();
				System.out.println(e1.getEmpID() + " " + e1.getName() + " " + e1.getAge() + " " + e1.getSalary());
				System.out.println();
				}
				System.out.println("-----End of Report-----");
				System.out.println();
				break;
			
			default:
				System.out.println();
				System.out.println("Exiting the System");
			
			}
		}
		
		
		
		out.close();
		oos.close();
		in.close();
		ois.close();
		
	}
}
