package InterestCalculator;
import Exceptions.*;
import java.util.*;
public class InterestCalculator {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int i=0;
	while(i!=4)
	{
		System.out.println("MAIN MENU : "+"\n"+"----------"+"\n");
		System.out.println("1.Interest Calculator - SB : "+"\n"+"2.Interest Calculator - FD : "+"\n"+"3.Interest Calculator - RD : "+"\n"+"4.Exit : ");
		System.out.print("Enter your choice (1..4) : ");
		
		i=sc.nextInt();
		
		sc.nextLine();
		
		switch(i)
		{
		case 1:
			SBAccount sb=new SBAccount();
			System.out.print("Enter the average amount in your account : ");
			double sbamt=sc.nextDouble();
			
			try
			{
				if(sbamt<0)
					throw new InvalidAmount();
				else
					sb.setAmount(sbamt);
					System.out.println("Interest gained is : "+sb.calculateInterest());
					System.out.println();
			}
			catch(Exception e) {}
			break;
		case 2:
			FDAccount fd=new FDAccount();
			System.out.print("Enter FD Amount : ");
			double fdamt = sc.nextDouble();
			System.out.print("Enter the number of Days : ");
			int days=sc.nextInt();
			System.out.print("Enter your Age : ");
			int age=sc.nextInt();
			try
			{
				if(fdamt<0)
					throw new InvalidAmount();
				else if(days<0)
					throw new InvalidNoOfDays();
				else if(age<0)
					throw new InvalidAge();
				else
					{fd.setAmount(fdamt);
					fd.setDays(days);
					fd.setAge(age);
					System.out.println("Interest gained is : "+fd.calculateInterest());
					System.out.println();}
			}
			catch(Exception e) {}
			break;
		case 3:
			RDAccount rd=new RDAccount();
			System.out.print("Enter RD Amount : ");
			double rdamt = sc.nextDouble();
			System.out.print("Enter the number of Months : ");
			int months=sc.nextInt();
			System.out.print("Enter your Age : ");
			int age1=sc.nextInt();
			try
			{
				if(rdamt<0)
					throw new InvalidAmount();
				else if(months<0)
					throw new InvalidNoOfDays();
				else if(age1<0)
					throw new InvalidAge();
				else
					{rd.setAmount(rdamt);
					rd.setMonths(months);
					rd.setAge(age1);
					System.out.println("Interest gained is : "+rd.calculateInterest());
					System.out.println();}
			}
			catch(Exception e) {}
			break;
		default:
			System.out.println("Thanks for using Interest Calculator");
			
			break;
			
		}
	}
}
}
