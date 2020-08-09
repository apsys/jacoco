package com.demo.jacoco;

public class Selection {
	//mine
	public void printSort(int[] a) {
		int min;
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				System.out.println("comparing a[i]: "+a[i]+" and a[j]: "+a[j]);
				if(a[j] < a[i]) {
					min = j;
					int temp = a[i];
					a[i] =  a[min];
					a[min] = temp;
					System.out.println("swapped: a[i]:"+a[i]+" a[j]:"+a[j]);
				}
			}
		}
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		
	}

	public static void main(String[] args) {
		int[] a = {34, 5, 23, 89, 65, 47, 95, 16, 11, 2, 7};
		Selection s = new Selection();
		s.printSort(a);

	}

}

/*
 * [0   n-1]
 * [i+1  n ]
 *   if a[j] < a[i]
 *   min =j
 *   swap a[i] a[min]
 */