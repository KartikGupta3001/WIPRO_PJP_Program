package Input;
import java.io.*;
import java.util.*;
public class IO2 {
public static void main(String args[]) throws IOException
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the input filename : ");
	String in = sc.nextLine();
	System.out.print("Enter the output filename : ");
	String out = sc.nextLine();

	FileReader fnr=new FileReader(in);
	FileWriter fnw=new FileWriter(out);
	
	BufferedReader br = new BufferedReader(fnr);
	BufferedWriter bw = new BufferedWriter(fnw);
	
	int i=br.read();
	while(i!=-1)
	{
		
		bw.write(i);
		i=br.read();
		
	}
	
	System.out.println("File is copied");
	br.close();
	bw.close();
	
}
}
