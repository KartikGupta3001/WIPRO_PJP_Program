package junit.palindrome;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo2Test {

	@Test
	public void testPalindromeCheck() {
		Demo2 d = new Demo2();
		assertEquals(true,d.palindromeCheck("madam"));
		assertEquals(false,d.palindromeCheck("abb"));
		assertEquals(true,d.palindromeCheck("dad"));
		assertEquals(false,d.palindromeCheck("kerala"));
	}

}
