package junit.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class demo1Test {

	@Test
	public void testStringConcat() {
		demo1 d=new demo1();
		assertEquals("KartikGupta",d.stringConcat("Kartik", "Gupta"));
		
	}

}
