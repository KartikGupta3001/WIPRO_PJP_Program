package live;
import music.*;
import music.string.Veena;
import music.wind.Saxophone;
public class Test {
public static void main(String args[])
{
	Veena v=new Veena();
	Saxophone s = new Saxophone();
	
	v.play();
	s.play();
	
	System.out.println();
	
	Playable v1=new Veena();
	Playable s1=new Saxophone();
	
	v1.play();
	s1.play();
}
}
