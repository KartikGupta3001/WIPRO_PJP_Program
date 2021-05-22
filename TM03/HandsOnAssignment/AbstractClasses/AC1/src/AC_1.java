abstract class GeneralBank
{
	abstract double getSavingsInterestRate();
	abstract double getFixedDepositInterestRate();
}
class ICICIBank extends GeneralBank
{
	@Override
	double getSavingsInterestRate()
	{
		return 4;
	}
	@Override
	double getFixedDepositInterestRate()
	{
		return 8.5;
	}
}
class KotMBank extends GeneralBank
{
	@Override
	double getSavingsInterestRate()
	{
		return 6;
	}
	@Override
	double getFixedDepositInterestRate()
	{
		return 9;
	}
}
public class AC_1 {
public static void main(String args[])
{
	ICICIBank i = new ICICIBank();
	KotMBank k = new KotMBank();
	System.out.println("ICICI Bank : "+"Saving Interests - "+i.getSavingsInterestRate()+", Fixed Deposits - "+i.getFixedDepositInterestRate());
	System.out.println("KotM Bank : "+"Saving Interests - "+k.getSavingsInterestRate()+", Fixed Deposits - "+k.getFixedDepositInterestRate());
	
	GeneralBank g1 = new ICICIBank();
	GeneralBank g2 = new KotMBank();
	System.out.println("General Bank1 : "+"Saving Interests - "+g1.getSavingsInterestRate()+", Fixed Deposits - "+g1.getFixedDepositInterestRate());
	System.out.println("General Bank2 : "+"Saving Interests - "+g2.getSavingsInterestRate()+", Fixed Deposits - "+g2.getFixedDepositInterestRate());
}
}
