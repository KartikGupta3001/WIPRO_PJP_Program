import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class M5 {
	TreeMap<String,String> t = new TreeMap<String,String>();
	
	public TreeMap<String,String> saveCountryCapital(String CountryName,String capital)
	{
		t.put(CountryName, capital);
		return t;
	}
	public String getCapital(String CountryName)
	{
		Set set = t.entrySet();
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
		Set set = t.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext())
		{
			Map.Entry m = (Map.Entry)i.next();
			if(m.getValue().equals(capitalName))
				return (String) m.getKey();
		}
		return "Country Not Found";
		
	}
	public TreeMap<String,String> swap()
	{
		TreeMap<String,String> t1=new TreeMap<String,String>();
		Set set = t.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext())
		{
			Map.Entry m = (Map.Entry)i.next();
			t1.put((String)m.getValue(),(String)m.getKey());
		}
		return t1;
		
	}
	public ArrayList<String> getKey()
	{
		ArrayList<String> a=new ArrayList<String>();
		Set set = t.entrySet();
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
		M5 m5=new M5();
		
		m5.saveCountryCapital("India","Delhi");
		m5.saveCountryCapital("Japan", "Tokyo");
		
		System.out.println(m5.getCountry("Tokyo"));
		System.out.println(m5.getCapital("India"));
		
		System.out.println(m5.swap());
		System.out.println(m5.getKey());
	}

}
