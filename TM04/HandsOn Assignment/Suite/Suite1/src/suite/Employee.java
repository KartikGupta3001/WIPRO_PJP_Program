package suite;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class Employee {
public String findName(ArrayList employees,String name)
{
	String result="";
	if(employees.contains(name)) {
		result="FOUND";
	}
	else
		result= "NOT FOUND";
	return result;
}

}
