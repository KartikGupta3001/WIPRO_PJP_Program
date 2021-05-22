package com.automobile;
import twowheeler.*;
import fourwheeler.*;
public class Vehicle_Test {
public static void main(String args[])
{
	Hero h1 = new Hero(90,"Passion Pro","UP80DE6025","Kartik Gupta");
	Honda h2 = new Honda(45,"Activa 6G","UP80BC5778","Praveen Gupta");
	Logan l = new Logan(120,"Petrol 1.4 GLX1390 cc","UP80BT5647","Harshit Gupta");
	Ford f = new Ford(100,"Ford EcoSport","UP80FE5468","Abha Gupta");
	
	
	System.out.println("Hero : "+" Model Name : "+h1.getModelName()+", Registration Name : "+h1.getRegistrationNumber()+", Owner Name : "+h1.getOwnerName()+", Speed : "+h1.getSpeed());
	h1.radio();
	System.out.println("Honda : "+" Model Name : "+h2.getModelName()+", Registration Name : "+h2.getRegistrationNumber()+", Owner Name : "+h2.getOwnerName()+", Speed : "+h2.getSpeed());
	h2.cdplayer();
	System.out.println("Logan : "+" Model Name : "+l.getModelName()+", Registration Name : "+l.getRegistrationNumber()+", Owner Name : "+l.getOwnerName()+", Speed : "+l.getSpeed());
	l.gps();
	System.out.println("Honda : "+" Model Name : "+f.getModelName()+", Registration Name : "+f.getRegistrationNumber()+", Owner Name : "+f.getOwnerName()+", Speed : "+f.getSpeed());
	f.tempControl();
}
}
