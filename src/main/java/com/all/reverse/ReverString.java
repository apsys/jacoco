package com.all.reverse;

import java.util.Scanner;

public class ReverString {

	public static void main(String[] args) {
		System.out.println("Enter Strng to be reversed");
		String orig = new Scanner(System.in).nextLine();
		String rev = "";
		for(int i=orig.length()-1; i>=0; i--) {
			rev = rev+orig.charAt(i);
		}
		System.out.println("reverse: "+rev);
	}

}
