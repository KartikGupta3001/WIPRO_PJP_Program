import java.util.TreeSet;
import java.util.Iterator;

class country{
TreeSet<String> t = new TreeSet<String>();
public TreeSet<String> addCountryNames(String CountryName) {
	t.add(CountryName);
	return t;
}
public String getCountry(String CountryName)
{
	Iterator i = t.iterator();
	while(i.hasNext())
	{
		if(i.next().equals(CountryName))
			return CountryName;
	}
	return null;
}
}
public class SET4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		country c = new country();
		c.addCountryNames("India");
		c.addCountryNames("Japan");
		c.addCountryNames("Sri Lanka");
		c.addCountryNames("Bangladesh");
		c.addCountryNames("Nepal");
		c.addCountryNames("Bhutan");
		
		
		
		System.out.println("Japan : "+c.getCountry("China"));
		System.out.println("India : "+c.getCountry("India"));
		
		
	}

}
