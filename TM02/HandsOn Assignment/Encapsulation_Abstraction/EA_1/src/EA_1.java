class Author
{
	String name;
	String mail;
	char gender;
	
	Author(String n,String m,char g)
	{
		name=n;
		mail=m;
		gender=g;
	}
	public String toString()
	{
		return "[Name: " + name + ", Email: " + mail + ", Gender: " + gender + "]";
	}
}

class Book
{
	String name;
	double price;
	int qtyInStock;
	Author authr;
	
	Book(String n,Author a,int qIS,double p)
	{
		name=n;
		price=p;
		qtyInStock=qIS;
		authr=a;
	}
	public String getString() {
		return "Book Name: " + name +", Author :"+authr+", Price: " + price + ", QtyInStock: " + qtyInStock;
	}
}
public class EA_1 {
public static void main(String args[])
{
	Author auth = new Author("Kartik Gupta","kartik.kggupta7043001@gmail.com",'M');
	Book b = new Book("Master in Java",auth, 500,199.0);
	System.out.println(b.getString());
	
}
}
