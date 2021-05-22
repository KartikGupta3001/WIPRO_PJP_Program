package Project1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class VideoTest {

	String videoName;
	int rating;
	@Before
	public void before()
	{
		videoName = "Classic";
		rating = 9;
		
	}
	Video v=new Video(videoName);

	@Test
	public void testGetName() {
		assertEquals(videoName,"Classic");
	}

	@Test
	public void testDoCheckout() {
		v.doCheckout();
		assertTrue(v.getCheckout());
	}

	@Test
	public void testDoReturn() {
		v.doReturn();
		assertFalse(v.getCheckout());
	}

	@Test
	public void testRecieveRating() {
		v.recieveRating(rating);
		assertEquals(rating,v.getRating());
	}

	@Test
	public void testGetRating() {
		v.recieveRating(rating);
		assertEquals(rating,v.getRating());
	}

	@Test
	public void testGetCheckout() {
		v.doCheckout();
		assertTrue(v.getCheckout());
		v.doReturn();
		assertFalse(v.getCheckout());
	}

}
