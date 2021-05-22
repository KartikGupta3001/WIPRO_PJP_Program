
public class Box {
double length;
double width;
double height;
double volume;

Box(double l,double w,double h)
{
	length=l;
	width=w;
	height=h;
}
double getVol()
{
	this.volume=height*length*width;
	return volume;
}
public String toString()
{
	String s = String.format("Length = "+length+" Width = "+width+" Height = "+height+" Volume = %.2f",volume);
	return s;
}
}
