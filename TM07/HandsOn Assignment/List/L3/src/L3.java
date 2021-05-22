import java.util.*;
public class L3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<String> as=new ArrayList<String>();
			as.add("Kartik Gupta");
			as.add("Harshit Gupta");
			as.add("Abha Gupta");
			as.add("Praveen Gupta");
			
			printAll(as);
	}
			
	static void printAll(ArrayList<String> as) {
			Iterator<String> i = as.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
	}

}
