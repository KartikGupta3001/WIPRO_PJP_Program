package com.automobile;
import twowheeler.*;
public class Vehicle_Test {
public static void main(String args[])
{
	Hero h1 = new Hero(90,"Passion Pro","UP80DE6025","Kartik Gupta");
	Honda h2 = new Honda(45,"Activa 6G","UP80BC5778","Praveen Gupta");
	
	System.out.println("Hero : "+" Model Name : "+h1.getModelName()+", Registration Name : "+h1.getRegistrationNumber()+", Owner Name : "+h1.getOwnerName()+", Speed : "+h1.getSpeed());
	h1.radio();
	System.out.println("Honda : "+" Model Name : "+h2.getModelName()+", Registration Name : "+h2.getRegistrationNumber()+", Owner Name : "+h2.getOwnerName()+", Speed : "+h2.getSpeed());
	h2.cdplayer();
}
}
