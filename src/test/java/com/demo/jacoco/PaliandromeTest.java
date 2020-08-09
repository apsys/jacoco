package com.demo.jacoco;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * @author: Nikil
 * This class is a unit test for Paliandrome class
 * 
 * */

public class PaliandromeTest {

	String input1 = "noon";

	Paliandrome p = new Paliandrome();
	boolean expected = true;

	@Test
	public void isPlaindromeTest() {
		
		assertEquals(expected, p.isPalindrome(input1));
	}

	@Test
	public void isNotPlaindromeTest() {
		
		assertEquals(false, p.isPalindrome("abc"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void isNotPlaindromeExceptionTest() {
		
		assertEquals(false, p.isPalindrome(null));
	}

}
