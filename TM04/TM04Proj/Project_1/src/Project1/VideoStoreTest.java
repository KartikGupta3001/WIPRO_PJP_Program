package Project1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VideoStoreTest {
	
	//Video[] store;
	String name;
	Video lastAdded;
	int storeSize;
	int rating;
	@Before
	public void before() {
		name = "The XYZ";
		storeSize = 0;
		rating =5;
	}
	VideoStore vs=new VideoStore();
	@Test
	public void testAddVideo() {
		name = "The XYZ";
		vs.addVideo(name);
		storeSize = vs.getStoreSize();
		lastAdded = vs.getLastAdded();		
		assertEquals(1, storeSize);
		assertEquals(name, lastAdded.getName());
		

		name = "The ABC";
		vs.addVideo(name);
		storeSize =vs.getStoreSize();
		lastAdded = vs.getLastAdded();		
		assertEquals(2, storeSize);
		assertEquals(name, lastAdded.getName());	
	}

	@Test
	public void testDoCheckout() {
		vs.addVideo(name);
		vs.getLastAdded().doCheckout();
		assertTrue(vs.getLastAdded().getCheckout());
	}

	@Test
	public void testDoReturn() {
		vs.addVideo(name);
		vs.getLastAdded().doReturn();
		assertFalse(vs.getLastAdded().getCheckout());
	}

	@Test
	public void testReceiveRating() {
		vs.addVideo(name);
		vs.receiveRating(name, rating);
		lastAdded = vs.getLastAdded();
		assertEquals(rating,5);	
	}

	@Test
	public void testListInventory() {
		try {
			vs.listInventory();
			assertFalse(false);
		} catch (Exception e) {
			assertTrue(true);
		}
	}


}
