import java.util.*;

class country{
HashSet<String> h1 = new HashSet<String>();
public HashSet<String> addCountryNames(String CountryName) {
	h1.add(CountryName);
	return h1;
}
public String getCountry(String CountryName)
{
	Iterator i = h1.iterator();
	while(i.hasNext())
	{
		if(i.next().equals(CountryName))
			return CountryName;
	}
	return null;
}
}
public class SET1 {

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
