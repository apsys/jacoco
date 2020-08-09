package com.all.reverse;

import java.util.StringTokenizer;

public class ReverseWordByWord {
	
	public void printRev(String s) {
		String[] rev = s.split(" ");
		int i=0;
		int l = rev.length-1;
		while(l >= i) {
			System.out.print(rev[l]+" ");
			l--;
		}
	}
	
	public void printRev2(String s) {
		StringTokenizer st = new StringTokenizer(s, " ");
		String strReversedLine = "";
		while(st.hasMoreTokens()) {
                strReversedLine = st.nextToken()+" "+strReversedLine ;
        }
       
        System.out.println("Reversed string by word is : " + strReversedLine);
	}

	public static void main(String[] args) {
		String orig = "My name is Amit";
		System.out.println("Original string: "+orig);
		ReverseWordByWord r = new ReverseWordByWord();
		System.out.print("reversed string: ");
		r.printRev(orig);
		System.out.println("");
		String orig2 = "my name is khan";
		System.out.println("Original string: "+orig2);
		r.printRev2(orig2);

	}

}
