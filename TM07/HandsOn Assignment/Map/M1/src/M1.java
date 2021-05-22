import java.util.*;
public class M1 {
	HashMap<String,String> h = new HashMap<String,String>();
	
	public HashMap<String,String> saveCountryCapital(String CountryName,String capital)
	{
		h.put(CountryName, capital);
		return h;
	}
	public String getCapital(String CountryName)
	{
		Set set = h.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext())
		{
			Map.Entry m = (Map.Entry)i.next();
			if(m.getKey().equals(CountryName))
				return (String) m.getValue();
		}
		return "Capital Not Found";
		
	}
	public String getCountry(String capitalName)
	{
		Set set = h.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext())
		{
			Map.Entry m = (Map.Entry)i.next();
			if(m.getValue().equals(capitalName))
				return (String) m.getKey();
		}
		return "Country Not Found";
		
	}
	public HashMap<String,String> swap()
	{
		HashMap<String,String> h1=new HashMap<String,String>();
		Set set = h.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext())
		{
			Map.Entry m = (Map.Entry)i.next();
			h1.put((String)m.getValue(),(String)m.getKey());
		}
		return h1;
		
	}
	public ArrayList<String> getKey()
	{
		ArrayList<String> a=new ArrayList<String>();
		Set set = h.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext())
		{
			Map.Entry m = (Map.Entry)i.next();
			a.add((String)m.getKey());
		}
		return a;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M1 m1=new M1();
		
		m1.saveCountryCapital("India","Delhi");
		m1.saveCountryCapital("Japan", "Tokyo");
		
		System.out.println(m1.getCountry("Tokyo"));
		System.out.println(m1.getCapital("India"));
		
		System.out.println(m1.swap());
		System.out.println(m1.getKey());
	}

}
