package com.vm.sortingalgorithms;

/**
 * Selection Sort Pseudo Code
 * 
 * SelectionSort(A,n){ 
 * TIME COMPLEXITY 
 * for i = 0 to n-2 { 
 * 	iMin = i;  -------------------------- n-1 *c1 
 * 	for j=i+1 to n-1 { 
 * 		if(A[j] < A[iMin]){ ---- (n-1)+(n-2)+(n-3)+...+1 = n(n-1)/2 
 * 		iMin = j; 
 * 	} 
 * 	swap A[i] and A[iMin] --------- n-1*c2 
 * 	} 
 * } 
 * }
 * 
 * equation will be like a2n+bn+c
 * 
 * Time Complexity = O(n^2) Slow algorithm
 * 
 * @author Venkatesh Manohar
 *
 */
public class SelectionSort {
	public static int[] sort(int[] A, int length) {
		for (int i = 0; i < A.length - 1; i++) {
			int iMin = i;
			for (int j = i + 1; j < A.length; j++) {
				if (A[j] < A[iMin]) {
					iMin = j;
				}
				
				int temp = A[i];
				A[i] = A[iMin];
				A[iMin]=temp;
			}
		}

		return A;
	}
	
	public static int[] initialize(int length){
		int[] result = new int[length];
		for (int i = 0; i < result.length; i++) {
			result[i]= length --;
		}
		return result;
	}
	
	
	public static void print(int[] A){
		/*for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" |");
		}
		
		System.out.println();*/
	}

	public static void main(String[] args) {
		int[] A = initialize(10);
		print(A);
		long startTime = System.currentTimeMillis();
		sort(A, 10);
		long estimatedTime = System.currentTimeMillis() - startTime;
		print(A);
		System.out.println("Time Taken = "+estimatedTime);
		
		A = initialize(100);
		print(A);
		startTime = System.currentTimeMillis();
		sort(A, 100);
		estimatedTime = System.currentTimeMillis() - startTime;
		print(A);
		System.out.println("Time Taken = "+estimatedTime);
	
		A = initialize(1000);
		print(A);
		startTime = System.currentTimeMillis();
		sort(A, 1000);
		estimatedTime = System.currentTimeMillis() - startTime;
		print(A);
		System.out.println("Time Taken = "+estimatedTime);
		
		A = initialize(10000);
		print(A);
		startTime = System.currentTimeMillis();
		sort(A, 10000);
		estimatedTime = System.currentTimeMillis() - startTime;
		print(A);
		System.out.println("Time Taken = "+estimatedTime);
		
		A = initialize(100000);
		print(A);
		startTime = System.currentTimeMillis();
		sort(A, 100000);
		estimatedTime = System.currentTimeMillis() - startTime;
		print(A);
		System.out.println("Time Taken = "+estimatedTime);
	}

}
