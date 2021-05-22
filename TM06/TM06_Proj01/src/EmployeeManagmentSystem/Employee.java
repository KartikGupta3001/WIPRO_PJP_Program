package EmployeeManagmentSystem;
import java.util.*;
import java.io.*;
public class Employee implements Serializable {
String name;
int age;
String empid;
double salary;

void setName(String n)
{
	name=n;
}
String getName()
{
	return name;
}
void setAge(int a)
{
	age=a;
}
int getAge()
{
	return age;
}
void setEmpID(String eid)
{
	empid=eid;
}
String getEmpID()
{
	return empid;
}
void setSalary(double s)
{
	salary=s;
}
double getSalary()
{
	return salary;
}
}
