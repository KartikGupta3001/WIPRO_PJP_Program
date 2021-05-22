import java.util.*;
public class M6 {
	Hashtable<String,String> h = new Hashtable<String,String>();
	
	public Hashtable<String,String> saveCountryCapital(String CountryName,String capital)
	{
		h.put(CountryName, capital);
		return h;
	}
	public String getCapital(String CountryName)
	{
		Enumeration name;
		name=h.keys();
		
		while(name.hasMoreElements())
		{
			String s=(String) name.nextElement();
			if(s.equals(CountryName))
				return (String)h.get(s);
		}
		return "Capital Not Found";
		
	}
	public String getCountry(String capitalName)
	{
		Enumeration name;
		name=h.keys();
		
		while(name.hasMoreElements())
		{
			String s=(String) name.nextElement();
			String s1=(String)h.get(s);
			if(s1.equals(capitalName))
				return (String)h.get(s);
		}
		return "Country Not Found";
		
	}
	public Hashtable<String,String> swap()
	{
		Hashtable<String,String> h1 = new Hashtable<String,String>();
		Enumeration name;
		name=h.keys();
		while(name.hasMoreElements())
		{
			String s=(String) name.nextElement();
			String s1=(String) h.get(s);
			h1.put(s1, s);
		}
		return h1;
		
	}
	public ArrayList<String> getKey()
	{
		ArrayList<String> a=new ArrayList<String>();
		Enumeration name;
		name=h.keys();
		while(name.hasMoreElements())
		{
			a.add((String)name.nextElement());
		}
		return a;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M6 m6=new M6();
		
		m6.saveCountryCapital("India","Delhi");
		m6.saveCountryCapital("Japan", "Tokyo");
		
		System.out.println(m6.getCountry("Tokyo"));
		System.out.println(m6.getCapital("India"));
		
		System.out.println(m6.swap());
		System.out.println(m6.getKey());
	}

}
