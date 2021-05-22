import java.util.ArrayList;
import java.util.Iterator;

class Employee
{
	int empId;
	String empName;
	String email;
	String gender;
	float salary;
	
	Employee(int id,String n,String e,String g,float s)
	{
		empId=id;
		empName=n;
		email=e;
		gender=g;
		salary=s;
	}
	
	int getEmpId()
	{
		return empId;
	}
	String getEmpName()
	{
		return empName;
	}
	String getEmail()
	{
		return email;
	}
	String getGender()
	{
		return gender;
	}
	float getSalary()
	{
		return salary;
	}
	
	void getEmployeeDetails()
	{
		System.out.println("Employee [EmpId=" + empId + ", EmpName=" + empName + ", EmpEmail=" + email 
				+ ", EmpGender=" + gender + ", EmpSalary=" + salary + "]");
	}
}

class EmployeeDB
{
	ArrayList<Employee> list=new ArrayList<Employee>();
	
	boolean addEmployee(Employee e)
	{
		return list.add(e);
	}
	boolean deleteEmployee(int empID)
	{
		boolean found = false;
		Iterator<Employee> i= list.iterator();
		while(i.hasNext())
		{
			if(i.next().getEmpId()==empID)
			{
				found = true;
				i.remove();
			}
		}
		return found;
	}
	String showPaySlip(int empID)
	{
		String s="Invalid Employee ID";
		Iterator<Employee> i= list.iterator();
		while(i.hasNext())
		{
			Employee e1=i.next();
			if(e1.getEmpId()==empID)
			{
				s="Payslip for the given empID "+empID+"is : "+e1.getSalary();
			}
		}
		return s;
		
	}
	Employee[] listAll()
	{
		Employee[] emplist = new Employee[list.size()];
		for(int i=0;i<list.size();i++)
			emplist[i]=list.get(i);
		return emplist;
	}
	
}
public class L2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee m1=new Employee(20732025, "Kartik Gupta", "kartik.kggupta7043001@gmail.com", "Male", 650000);
		Employee m2=new Employee(20732026, "Harshit Gupta", "harshit.gupta0705@gmail.com", "Male", 550000);
		Employee m3=new Employee(20732027, "Praveen Gupta", "praveen.gupta704@gmail.com", "Male", 1050000);
		Employee m4=new Employee(20732028, "Abha Gupta", "abha.gupta0510@gmail.com", "Female", 750000);
		
		EmployeeDB mdb=new EmployeeDB();
		mdb.addEmployee(m1);
		mdb.addEmployee(m2);
		mdb.addEmployee(m3);
		mdb.addEmployee(m4);
		
		for(Employee m:mdb.listAll())
			m.getEmployeeDetails();
		System.out.println();
		mdb.deleteEmployee(20732028);
		mdb.deleteEmployee(20732026);
		for(Employee m:mdb.listAll())
			m.getEmployeeDetails();
		System.out.println();
		mdb.showPaySlip(20732025);
	}

}
