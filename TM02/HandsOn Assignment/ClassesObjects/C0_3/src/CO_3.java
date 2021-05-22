class Patient
{
	String patientName;
	double height;
	double weight;
	
	Patient(String pn,double h,double w)
	{
		patientName = pn;
		height = h;
		weight = w;
	}
	
	double computeBMI()
	{
		height=height/100;
		return (weight / (height*height));
	}
}
public class CO_3 {
public static void main(String args[])
{
	Patient p = new Patient("Kartik",165.8,63.5);
	System.out.println(p.computeBMI());
}
}
