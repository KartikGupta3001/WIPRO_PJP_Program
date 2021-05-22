package junit.palindrome;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo2 {

	boolean palindromeCheck(String s)
	{
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1+=s.charAt(i);
		}
		if(s1.equalsIgnoreCase(s))
			return true;
		else
			return false;
	}
}
