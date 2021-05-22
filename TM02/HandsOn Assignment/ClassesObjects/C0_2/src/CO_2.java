
class Calculator
{
	
	static int powerInt(int num1, int num2)
	{
		return (int)Math.pow(num1, num2);
	}
	static double powerDouble(double num1, double num2)
	{
		return Math.pow(num1, num2);
	}
}
public class CO_2 {
public static void main(String args[])
{
	Calculator c = new Calculator();
	System.out.println(c.powerInt(10,4));
	System.out.println(c.powerDouble(2,4.5));
}
}
