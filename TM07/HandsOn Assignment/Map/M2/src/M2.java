import java.util.*;
public class M2 {

	static HashMap<String,String> h = new HashMap<String,String>();
	
	public String checkKey(String key)
	{
		Set set = h.entrySet();
		Iterator i=set.iterator();
		
		while(i.hasNext())
		{
			Map.Entry m = (Map.Entry)i.next();
			if(m.getKey().equals(key))
				return "Key exists";
		}
		return "Key does not exists";
		
	}
	public String checkValue(String value)
	{
		Set set = h.entrySet();
		Iterator i=set.iterator();
		
		while(i.hasNext())
		{
			Map.Entry m = (Map.Entry)i.next();
			if(m.getValue().equals(value))
				return "Value exists";
		}
		return "Value does not exists";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		h.put("H","Harshit");
		h.put("K","Kartik");
		h.put("A","Abha");
		h.put("P","Praveen");
		
		System.out.println(h);
		
		M2 m2 = new M2();
		
		System.out.println(m2.checkKey("k"));
		System.out.println(m2.checkValue("Praveen"));
		
	}

}
