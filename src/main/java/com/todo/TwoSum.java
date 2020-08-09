package com.todo;

import java.util.HashMap;

public class TwoSum {

	public int[] twoSum(int[] numbers, int target) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];
		System.out.println("array length: "+numbers.length);
		
		for (int i = 0; i < numbers.length; i++) { 
			
			System.out.println("numbers[i] :"+numbers[i]);

			if (map.containsKey(numbers[i])) {
				int index = map.get(numbers[i]);
				result[0] = index ;
				result[1] = i;
				break;
			} else {
				map.put(target - numbers[i], i);
			} 
		}
		return result;
	}

	public static void main(String args[]) {
		TwoSum s = new TwoSum();
		int numbers[] = {12, 7, 12, 1, 2}; int target=9;

		int[] a  = s.twoSum(numbers, target);		
		System.out.println("first: "+a[0]+" second: "+a[1]);
	}
}