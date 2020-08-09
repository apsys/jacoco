package com.all.reverse;

public class ReverIntArray {

		public static void main(String[] args){
			int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
			System.out.print("before reverse: ");
			for(int i=0; i<array.length; i++){	
				System.out.print(array[i]+" ");
			}
			
			int n = array.length;
			int k = 3;
			ReverIntArray rev = new ReverIntArray();
			rev.arrayRev(array, n, k);
			
			for(int i=0; i<array.length; i++){
				System.out.print(array[i]+" ");
			}
		}

		private void arrayRev(int[] array, int n, int k) {
			System.out.println();
			
			for(int i=0; i<n; i+=k) {
				int right = i;
				int left = Math.min(i+k-1, n-1);
				
				System.out.println("right:"+right+" left:"+left);
				
				while (right < left) {
					int temp = array[right];
					array[right] = array[left];
					array[left] = temp;
					left--;
					right++;
				}
			}
		}	
}
