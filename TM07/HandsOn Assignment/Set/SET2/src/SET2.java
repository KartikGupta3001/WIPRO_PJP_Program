import java.util.*;
public class SET2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h1 = new HashSet<String>();
		
		h1.add("Kartik Gupta");
		h1.add("Praveen Gupta");
		h1.add("Abha Gupta");
		h1.add("Harshit Gupta");
		
		Iterator i = h1.iterator();
		System.out.println("Employee Names : \n");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
