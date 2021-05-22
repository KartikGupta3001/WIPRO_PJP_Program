import java.util.Random;
abstract class Instrument
{
	abstract String play();
}
class Piano extends Instrument
{
	@Override
	String play()
	{
		return "Piano is playing tan tan tan tan";
	}
}
class Flute extends Instrument
{
	@Override
	String play()
	{
		return "Flute is playing toot toot toot toot ";
	}
}
class Guitar extends Instrument
{
	@Override
	String play()
	{
		return "Guitar is playing tin tin tin tin";
	}
}
public class AC_3 {

	public static void main(String args[])
	{
		Instrument[] in=new Instrument[10];
		Random rand = new Random();
		
		
		for(int i=0;i<10;i++)
		{
			int n = rand.nextInt(3)+1;
			if(n==1)
				in[i]=new Piano();
			else if(n==2)
				in[i]=new Flute();
			else if(n==3)
				in[i]=new Guitar();
			
			
			
		}
		for(int i=0;i<10;i++)
		{
			if(in[i] instanceof Piano)
				System.out.print("Instrument "+i+" is Piano , ");
			if(in[i] instanceof Flute)
				System.out.print("Instrument "+i+" is Flute , ");
			if(in[i] instanceof Guitar)
				System.out.print("Instrument "+i+" is Guitar, ");
			
			System.out.println(in[i].play());	
		}
		
	}
}
