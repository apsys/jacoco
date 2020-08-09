package com.demo.jacoco;

public class Paliandrome {

	public boolean isPalindrome(String input) {

		if (input == null) {
			throw new IllegalArgumentException("input is null");
		}

		if (input.equals(reverse(input))) {
			return true;
			
		} else {
			
			return false;
		}
	}

	private String reverse(String input) {
		
		String reverse = "";
		
		for (int i=input.length()-1; i>=0; i--) {
			
			reverse = reverse+input.charAt(i);
		}
		
		return reverse;
	}
	
    public static void main (String args[]) {
    	Paliandrome p = new Paliandrome();
    	
    	if(p.isPalindrome("nitin"))
    		System.out.println("paliandrome");
    	else
    		System.out.println("not paliandrome");
    }

}
