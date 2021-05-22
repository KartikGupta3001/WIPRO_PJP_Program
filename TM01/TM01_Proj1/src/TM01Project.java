
public class TM01Project {
public static void main(String args[])
{
	int n = Integer.parseInt(args[0]);
	int [] empid = {1001,1002,1003,1004,1005,1006,1007};
	String[] empname = {"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
	String[] jd = {"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/1/2005","12/06/2006"};
	char[] dc = {'e','c','k','r','m','e','c'};
	String[] dept = { "R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM" };
    int[] basic = { 20000, 30000, 10000, 12000, 50000, 23000, 29000 };
    int[] hra = { 8000, 12000, 8000, 6000, 20000, 9000, 12000 };
    int[] it = { 3000, 9000, 1000, 2000, 20000, 4400, 10000 };
    int i=n%10 -1,s=0;
    char ch;
    if(n<1001&&n>1007)
    System.out.println("There is no employ with empid : "+n);
    else
    {
    System.out.println("Emp No.  Emp Name  Department  Designation  Salary ");
    System.out.print(n+"\t"+"\t"+empname[i]+"\t"+ "\t"+dept[i]+"\t"+"\t");
    ch=dc[i];
    switch(ch)
    {
    case 'e':
    	s=basic[i]+hra[i]-it[i]+20000;
    	System.out.print("ENGINEER"+"\t"+"\t"+s);
    	break;
    case 'c':
    s=basic[i]+hra[i]-it[i]+32000;
	System.out.print("CONSULTANT"+"\t"+"\t"+s);
    break;
    case 'k':
    	s=basic[i]+hra[i]-it[i]+12000;
    	System.out.print("CLERK"+"\t"+"\t"+s);
    	break;
    case 'r':
    	s=basic[i]+hra[i]-it[i]+15000;
    	System.out.print("RECEPTIONIST"+"\t"+"\t"+s);
    	break;
    case 'm':
    	s=basic[i]+hra[i]-it[i]+40000;
    	System.out.print("MANAGER"+"\t"+"\t"+s);
    	break;
    }
    }
}}
