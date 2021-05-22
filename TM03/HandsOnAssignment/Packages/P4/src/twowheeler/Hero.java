package twowheeler;
import com.automobile.*;
public class Hero extends Vehicle {

	double speed;
	String mn;
	String rn;
	String on;
	
	public Hero(double speed,String mn,String rn,String on)
	{
		this.speed=speed;
		this.mn=mn;
		this.rn=rn;
		this.on=on;
	}
	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return mn;
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return rn;	
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return on;
	}
	
	public double getSpeed()
	{
		return speed;
	}
	public void radio()
	{
		System.out.println("Radio is not accessible");
	}
	

}
