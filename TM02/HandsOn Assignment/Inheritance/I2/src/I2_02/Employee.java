package I2_02;

public class Employee extends Person {
double annsal;
int year;
String insurance;

Employee(String name,double as,int y,String i)
{
	super(name);
	annsal=as;
	year=y;
	insurance=i;
}
double getAnnSal()
{
	return annsal;
}
int getYear()
{
	return year;
}
String getInsurance()
{
	return insurance;
}
}
