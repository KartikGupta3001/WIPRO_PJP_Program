package InterestCalculator;

public class RDAccount extends Account{

	int noOfMonths;
	int ageOfACHolder;
	double monthlyAmount;
	
	void setMonths(int months)
	{
		noOfMonths=months;
	}
	int getMonths()
	{
		return noOfMonths;
	}
	void setAge(int age)
	{
		ageOfACHolder=age;
	}
	int getAge()
	{
		return ageOfACHolder;
	}
	void setAmount(double a)
	{
		amount=a;
	}
	double getAmount()
	{
		return amount;
	}
	void setIR(double ir)
	{
		interestRate=ir;
	}
	double getIR()
	{
		return interestRate;
	}
	void setMonAmount(double monamt)
	{
		monthlyAmount=monamt;
	}
	double getMonAmount()
	{
		return monthlyAmount;
	}
	@Override
	double calculateInterest() {
		// TODO Auto-generated method stub
		double RateInterest=0;
		if(noOfMonths>=6 && noOfMonths<9)
			RateInterest=7.5;
		if(noOfMonths>=9 && noOfMonths<12)
			RateInterest=7.75;
		if(noOfMonths>=12 && noOfMonths<15)
			RateInterest=8;
		if(noOfMonths>=15 && noOfMonths<18)
			RateInterest=8.25;
		if(noOfMonths>=18 && noOfMonths<21)
			RateInterest=8.5;
		if(noOfMonths>=21)
			RateInterest=8.75;
		
		if(ageOfACHolder>=65)
			RateInterest+=0.5;
		
		
		double interest = amount*RateInterest/100;
		return interest;
	}

	
}
