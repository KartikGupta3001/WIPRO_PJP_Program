package InterestCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class RDAccountTest {

	RDAccount rd=new RDAccount();
	@Test
	public void testCalculateInterest() {
		rd.setAmount(50000);
		rd.setAge(45);
		rd.setMonths(20);
		assertEquals(4250.0,rd.calculateInterest(),0.0);
	}

	@Test
	public void testSetMonths() {
		rd.setMonths(20);
		assertEquals(20,rd.getMonths());
	}

	@Test
	public void testSetAge() {
		rd.setAge(45);
		assertEquals(45,rd.getAge());
	}

	@Test
	public void testSetAmount() {
		rd.setAmount(50000);
		assertEquals(50000.0,rd.getAmount(),0.0);
	}

	@Test
	public void testSetIR() {
		rd.setIR(8);
		assertEquals(8.0,rd.getIR(),0.0);
	}
	@Test
	public void testSetMonAmount() {
		rd.setMonAmount(5000);
		assertEquals(5000.0,rd.getMonAmount(),0.0);
	}

}
