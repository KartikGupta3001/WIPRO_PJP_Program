package IN1_1;
interface LibraryUser
{
	void registerAccount();
	void requestBook();
}

class KidUsers implements LibraryUser
{
	int age;
	String bookType;
	
	KidUsers(int age,String bookType)
	{
		this.age=age;
		this.bookType=bookType;
	}
	@Override
	public void registerAccount()
	{
		if(age<12)
			System.out.println("You have successfully registered under Kids Account");
		else
			System.out.println("Sorry, Age must be less than 12 to register as a Kid");
	}
	@Override
	public void requestBook() 
	{
		if(bookType.equals("Kids"))
			System.out.println("Book issued successfully, please return the book within 10 days");
		else
			System.out.println("Oops,you are allowed to take only kids books");
		
	}
}
class AdultUsers implements LibraryUser
{
	int age;
	String bookType;
	
	AdultUsers(int age,String bookType)
	{
		this.age=age;
		this.bookType=bookType;
	}
	@Override
	public void registerAccount()
	{
		if(age>12)
			System.out.println("You have successfully registered under Adult Account");
		else
			System.out.println("Sorry, Age must be greater than 12 to register as a Adult");
	}
	@Override
	public void requestBook() 
	{
		if(bookType.equals("Fiction"))
			System.out.println("Book issued successfully, please return the book within 7 days");
		else
			System.out.println("Oops,you are allowed to take only adults books");
		
	}
}
public class LibraryInterfaceDemo {
	public static void main(String args[])
	{
	KidUsers ku = new KidUsers(14,"Fiction");
	KidUsers k = new KidUsers(11,"Kids");
	ku.registerAccount();
	ku.requestBook();
	System.out.println();
	k.registerAccount();
	k.requestBook();
	System.out.println();
	AdultUsers au = new AdultUsers(23,"Kids");
	AdultUsers a = new AdultUsers(23,"Fiction");
	au.registerAccount();
	au.requestBook();
	System.out.println();
	a.registerAccount();
	a.requestBook();
}
}
