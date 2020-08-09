package com.all.reverse;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseWordByWord2 {
	public static void main(String[] args){
		   String original;
           String strReversedLine = "";
		   Scanner in = new Scanner(System.in);
			System.out.println("Enter a string to be reverse:");
			original = in.nextLine();

           //specify delimiter as " " space
           StringTokenizer st = new StringTokenizer(original, " ");
          
          
           while(st.hasMoreTokens())
           {
                   strReversedLine = st.nextToken()+" "+strReversedLine ;
           }
          
           System.out.println("Reversed string by word is : " + strReversedLine);
   }
	}