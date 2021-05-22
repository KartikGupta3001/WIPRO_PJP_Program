package InterestCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class FDAccountTest {
	FDAccount fd=new FDAccount();
	@Test
	public void testCalculateInterest() {
		fd.setAmount(250000);
		fd.setAge(60);
		fd.setDays(45);
		assertEquals(13750.0,fd.calculateInterest(),0.0);
	}

	@Test
	public void testSetDays() {
		fd.setDays(45);
		assertEquals(45,fd.getDays());
	}

	@Test
	public void testSetAge() {
		fd.setAge(45);
		assertEquals(45,fd.getAge());
	}

	@Test
	public void testSetAmount() {
		fd.setAmount(250000);
		assertEquals(250000.0,fd.getAmount(),0.0);
	}

	@Test
	public void testSetIR() {
		fd.setIR(5);
		assertEquals(5.0,fd.getIR(),0.0);
	}

}
