import java.util.*;
public class M3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Properties p = new Properties();
			
			p.put("Uttarakhand", "Dehradun");
			p.put("Uttar Pradesh", "Lucknow");
			p.put("Orrisa", "Bhubneshwar");
			p.put("Karnataka", "Banglore");
			p.put("Punjab", "Chandigarh");
			
			Set set=p.entrySet();
			Iterator i = set.iterator();
			
			while(i.hasNext())
			{
				Map.Entry m = (Map.Entry)i.next();
				System.out.println("State is : "+m.getKey()+" and it's Capital is : "+m.getValue());
			}
	}

}
