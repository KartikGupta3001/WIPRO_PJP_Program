package Input;
import java.io.*;
import java.util.*;
public class IO1 {
public static void main(String args[]) throws IOException
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the filename : ");
	String fname = sc.nextLine();
	System.out.print("Enter the character to be counted : ");
	char c=sc.nextLine().charAt(0);
	FileReader fn=new FileReader(fname);
	BufferedReader br = new BufferedReader(fn);
	
	
	int count=0;
	
	int i=br.read();
	while(i!=-1)
	{
		i=br.read();
		if(c==i || (c+32)==i)
			count++;
		
	}
	
	System.out.println("File "+fname + " has "+count+" instances of letter "+c);
	br.close();
	
}
}
