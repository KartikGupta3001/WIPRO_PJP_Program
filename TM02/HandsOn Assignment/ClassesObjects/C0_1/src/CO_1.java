class Box
{
	double width;
	double height;
	double length;
	
	Box(double w,double h,double l)
	{
		width=w;
		height=h;
		length=l;
	}
	
	double getVolume()
	{
		return width*length*height;
	}
}
public class CO_1 {
public static void main(String args[])
{
	Box b = new Box(4,6,2);
	System.out.println(b.getVolume());
	
}
}