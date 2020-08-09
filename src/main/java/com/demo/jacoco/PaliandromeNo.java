package com.demo.jacoco;

public class PaliandromeNo {
	
	public void isPaliandrome(int n) {
		int ori = n;
		int sum=0;
		while (n>0) {         //137 , 
			int r = n%10;     //r=7 , 3, 1
			n = n/10;         //n=13 , 1, 1
			sum = sum*10+r;    //0*10+7=7 ,7*10+3=73, 
		}
		if(ori == sum)
			System.out.println(ori+" is Paliandrome");
		else
			System.out.println(ori+" is Not Paliandrom");
	}

	public static void main(String[] args) {
		PaliandromeNo p = new PaliandromeNo();

		int[] numbers = new int[] {321, 21, 121, 454, 444};
		for (int n : numbers)
			p.isPaliandrome(n);
	}
}
