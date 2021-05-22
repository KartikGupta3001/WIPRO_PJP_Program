package InterestCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SBAccountTest {
	SBAccount sb = new SBAccount();
	@Test
	public void testCalculateInterest() {
		sb.setAmount(10000);
		assertEquals(600.0,sb.calculateInterest(),0.0);
	}

	@Test
	public void testSetAmount() {
		sb.setAmount(10000);
		assertEquals(10000.0,sb.getAmount(),0.0);
	}

	@Test
	public void testSetIR() {
		sb.setIR(6.5);
		assertEquals(6.5,sb.getIR(),0.0);
	}

}
