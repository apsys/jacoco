package com.all.reverse;

public class ReverseStringRecurssive {

	public static void main(String[] args) {
		String s = "ABCDEFG";
		System.out.println(s.substring(1));
		System.out.println(s.substring(0,1));
		System.out.println(reverse("ABCDEFG"));
	}
	private static String reverse(String str) {
		if (str.length() <= 1) {
			return str;
		}
		return reverse(str.substring(1)) + str.substring(0, 1);
	}

}
