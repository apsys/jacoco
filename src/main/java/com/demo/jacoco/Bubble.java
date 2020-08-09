package com.demo.jacoco;

public class Bubble {
	
	public void printBubble(int a[]) {
		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a.length-1; j++) {
				if(a[j] > a[j+1]) {
					int temp = 0;
					temp = a[j];
					a[j] =  a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for (int i=0; i<a.length; i++)
			System.out.println(a[i]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 40, 30, 80, 70, 90, 20, 10};
		Bubble b = new Bubble();
		b.printBubble(a);

	}
}

/*
    [0  l  ]
    [0  l-1]
    
    j > j+1
*/