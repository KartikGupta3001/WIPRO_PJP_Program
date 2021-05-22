package suite;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class EmployeeTest {

	ArrayList<String> list = new ArrayList<>();
	{
		list.add("Kartik");
		list.add("Harshit");
		list.add("Praveen");
		list.add("Abha");
	}
	
	@Test
	public void testFindName() {
		Employee e = new Employee();
		assertEquals("FOUND",e.findName(list, "Kartik"));
		assertEquals("NOT FOUND",e.findName(list, "Geetisha"));
	}

}
