package test;

public class foundation_test {
	public static void main(String args[])
	{
foundation f = new foundation();
//f.var1=9; /*Not Accessible*/
f.var2=4;	/*Accessible*/
f.var3=8;	/*Accessible*/
f.var4=9;	/*Accessible*/

//System.out.println(f.var1);
System.out.println(f.var2);
System.out.println(f.var3);
System.out.println(f.var4);
}
}