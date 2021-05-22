class Person
{
	String name;
	String dob;
	
	Person(String n,String dob)
	{
		name=n;
		this.dob=dob;
	}
	String getName()
	{
		return name;
	}
	String getDOB()
	{
		return dob;
	}
}
class Teacher extends Person
{
	double salary;
	String subject;
	
	Teacher(String name,String dob,double salary,String subject)
	{
		super(name,dob);
		this.salary=salary;
		this.subject=subject;		
	}
	
	double getSalary()
	{
		return salary;
	}
	String getSubject()
	{
		return subject;
	}
	
}
class Student extends Person
{
	String SID;
	
	Student(String name,String dob,String SID)
	{
		super(name,dob);
		this.SID=SID;
	}
	
	String getSid()
	{
		return SID;
	}
}
class CollegeStudent extends Student
{
	String clgname;
	String year;
	
	CollegeStudent(String name,String dob,String SID,String clgname,String year)
	{
		super(name,dob,SID);
		this.clgname=clgname;
		this.year=year;
	}
	
	String getCollege()
	{
		return clgname;
	}
	String getYear()
	{
		return year;
	}
}
public class I3 {
public static void main(String args[])
{
	Person p = new Person("Mr.Praveen Gupta","04/12/1970");
	Teacher t = new Teacher("Mr.Praveen Gupta","04/12/1970",1000000,"Maths");
	Student s = new Student("Kartik Gupta","30/01/1999","17BEC0548");
	CollegeStudent cs = new CollegeStudent("Kartik Gupta","30/01/1999","17BEC0548","VIT UNIVERSITY","Fourth");
	
	System.out.println("Teachers Details : ");
	System.out.println("Name : " + p.getName()+", Datee of Birth : "+p.getDOB()+", Salary : "+t.getSalary()+", Subject : "+t.getSubject());
	
	System.out.println("Students Details : ");
	System.out.println("Name : " + p.getName()+", Datee of Birth : "+p.getDOB()+", Student ID : "+s.getSid()+", College Name : "+cs.getCollege()+", Year : "+cs.getYear());
}
}
