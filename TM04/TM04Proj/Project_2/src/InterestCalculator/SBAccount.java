package InterestCalculator;

public class SBAccount extends Account{
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
		String AccountType="NRI";
		if(AccountType.equals("Normal"))
			RateInterest=4;
		else if(AccountType.equals("NRI"))
			RateInterest=6
			;
		double interest = amount*RateInterest/100;
		return interest;
	}
	

}
