package com.demo.jacoco;

class SelectionSort 
{ 
	void sort(int a[]) { 
		//geeksforgeeks
		// One by one move boundary of unsorted subarray 
		for (int i = 0; i < a.length-1; i++) { 
			// Find the minimum element in unsorted array 
			int min = i; 
			for (int j = i+1; j < a.length; j++) {
				System.out.println("comparing a[i]: "+a[i]+" and a[j]: "+a[j]);
				if (a[j] < a[min]) 
					min = j; 				    
			}
			
			// Swap the found minimum element with the first 
			int temp = a[min]; 
			a[min] = a[i]; 
			a[i] = temp; 
		} 
	} 

	void printArray(int a[]) { 
		for (int i=0; i<a.length; ++i) 
			System.out.print(a[i]+" "); 
	} 
 
	public static void main(String args[]) 
	{ 
		SelectionSort ob = new SelectionSort(); 
		int arr[] = {34, 5, 23, 89, 65, 47, 95, 16, 11, 2, 7}; 
		ob.sort(arr); 
		System.out.println("Sorted array"); 
		ob.printArray(arr); 
	} 
} 
