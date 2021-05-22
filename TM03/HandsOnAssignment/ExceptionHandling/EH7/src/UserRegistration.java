import java.util.*;

class InvalidCountryException extends Exception
{
	InvalidCountryException()
	{
		System.out.println("InvalidCountryException occured");
		System.out.println("User outside India cannot be registered");
	}
}
class UserRegistration {

	void registerUser(String username,String userCountry) throws InvalidCountryException
	{
		if(userCountry.equals("India"))
			System.out.println("User Registration done successfully");
		else
			throw new InvalidCountryException();
	}
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Name : ");
	String name = sc.nextLine();
	System.out.print("Country Name : ");
	String countryname = sc.nextLine();
	
	try
	{
		UserRegistration ue = new UserRegistration();
		ue.registerUser(name, countryname);
	}
	catch(InvalidCountryException e)
	{
		System.out.println();
	}
}}