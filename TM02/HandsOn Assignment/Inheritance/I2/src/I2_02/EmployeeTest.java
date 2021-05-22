package I2_02;

public class EmployeeTest {
public static void main(String args[])
{
	Employee e = new Employee("Kartik",650000,2020,"17BEC0548");
	
	System.out.println("Details of Employee : ");
	System.out.println("Name : "+e.getName());
	System.out.println("Annual Salary : "+e.getAnnSal());
	System.out.println("Starting Year : "+e.getYear());
	System.out.println("National Insurance Number : "+e.getInsurance());
}
}
