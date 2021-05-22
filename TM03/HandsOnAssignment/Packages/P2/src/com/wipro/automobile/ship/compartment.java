package com.wipro.automobile.ship;

public class compartment {
double height;
double length;
double width;

compartment(double h,double l,double w)
{
	height=h;
	length=l;
	width=w;
}
double getVolume()
{
	return height*length*width;
}
}
