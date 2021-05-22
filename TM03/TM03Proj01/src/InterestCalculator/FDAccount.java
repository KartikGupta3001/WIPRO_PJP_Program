package InterestCalculator;

public class FDAccount extends Account{
	int noOfDays;
	int ageOfACHolder;
	
	void setDays(int days)
	{
		noOfDays=days;
	}
	int getDays()
	{
		return noOfDays;
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
	@Override
	double calculateInterest() {
		// TODO Auto-generated method stub
		double RateInterest=0;
		if(amount<10000000)
		{
			if(noOfDays>=7 && noOfDays<=14)
				RateInterest=4.5;
			else if(noOfDays>=15 && noOfDays<=29)
				RateInterest=4.75;
			else if(noOfDays>=30 && noOfDays<=45)
				RateInterest=5.5;
			else if(noOfDays>=45 && noOfDays<=60)
				RateInterest=7;
			else if(noOfDays>=61 && noOfDays<=184)
				RateInterest=7.5;
			else if(noOfDays>185 && noOfDays<=365)
				RateInterest=8;
	
		if(ageOfACHolder>=65)
			RateInterest+=0.5;
		}
		else
		{
			if(noOfDays>=7 && noOfDays<=14)
				RateInterest=6.5;
			else if(noOfDays>=15 && noOfDays<=29)
				RateInterest=6.75;
			else if(noOfDays>=30 && noOfDays<=45)
				RateInterest=6.75;
			else if(noOfDays>=45 && noOfDays<=60)
				RateInterest=8;
			else if(noOfDays>=61 && noOfDays<=184)
				RateInterest=8.5;
			else if(noOfDays>185 && noOfDays<=365)
				RateInterest=10;
		}
		
		double interest = amount*RateInterest/100;
		return interest;
	}

}
