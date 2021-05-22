import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class M4 {

	static HashMap<String,Long> h = new HashMap<String,Long>();
	
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
	public String checkValue(long l)
	{
		Set set = h.entrySet();
		Iterator i=set.iterator();
		
		while(i.hasNext())
		{
			Map.Entry m = (Map.Entry)i.next();
			if(m.getValue().equals(l))
				return "Value exists";
		}
		return "Value does not exists";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		h.put("H",8433406854L);
		h.put("K",8126488048L);
		h.put("A",9997996370L);
		h.put("P",9997996371L);
		
		System.out.println(h);
		
		M4 m4 = new M4();
		
		System.out.println(m4.checkKey("g"));
		System.out.println(m4.checkValue(9997996371L));
		
	}

}
