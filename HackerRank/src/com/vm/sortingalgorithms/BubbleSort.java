package com.vm.sortingalgorithms;

import com.vm.utility.ArrayUtility;
import com.vm.utility.PerformanceLogging;

/**
 * BubbleSort PseudoCode
 * 
 * BubbleSort(A, n)						TIME COMPLEXITY
 * for k=0 to n-1 {
 * 		for i=0 to n-2 {
 * 			if(A[i]>A[i+1]){           --------- } c1*n-1*n-1 = cn^2-cn-1 =  O(n^2)
 * 				swap(A[i], A[i+1])     ========= }         
 * 			}
 * 		}
 * }
 * Slow algorithm
 * 
 * Can be improved by not considering already sorted part
 * BubbleSort(A, n)						TIME COMPLEXITY
 * for k=0 to n-1 {
 * 		for i=0 to n-k-1 {
 * 			if(A[i]>A[i+1]){           --------- } c1*n-1*n-1 = cn^2-cn-1 =  O(n^2)
 * 				swap(A[i], A[i+1])     ========= }         
 * 			}
 * 		}
 * }
 * 
 * * Can be improved further by not looping if the list is already sorted
 * BubbleSort(A, n)						TIME COMPLEXITY
 * for k=0 to n-1 {
 * 		boolean flag = true;
 * 		for i=0 to n-k-1 {
 * 			if(A[i]>A[i+1]){           --------- } c1*n-1*n-1 = cn^2-cn-1 =  O(n^2)
 * 				swap(A[i], A[i+1])     ========= }
 * 				flag = false         
 * 			}
 * 		}
 * 		if(flag) break;								Best case O(n) if array already sorted
 * 
 * }
 * Average case and worst case O(n^2)
 * Average case is if half of the list is already sorted
 * @author 212342800
 *
 */
public class BubbleSort {
	public static int[] sort(int[] A, int length) {
		for (int i = 0; i < A.length ; i++) {
			boolean flag = true;
			for (int j = 0; j < A.length-i-1; j++) {
				if(A[j]>A[j+1]){
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
					flag = false;
				}
				
			}
			if(flag) break;
		}

		return A;
	}

	public static void main(String[] args) {
		int[] A = ArrayUtility.initializeDesc(10);
		ArrayUtility.print(A);
		long startTime = PerformanceLogging.start();
		sort(A, 10);
		long estimatedTime = PerformanceLogging.stop(startTime);
		ArrayUtility.print(A);
		System.out.println("Time Taken = " + estimatedTime);

		A = ArrayUtility.initializeDesc(100);
		ArrayUtility.print(A);
		startTime = PerformanceLogging.start();
		sort(A, 100);
		estimatedTime = PerformanceLogging.stop(startTime);
		ArrayUtility.print(A);
		System.out.println("Time Taken = " + estimatedTime);

		A = ArrayUtility.initializeDesc(1000);
		ArrayUtility.print(A);
		startTime = PerformanceLogging.start();
		sort(A, 1000);
		estimatedTime = PerformanceLogging.stop(startTime);
		ArrayUtility.print(A);
		System.out.println("Time Taken = " + estimatedTime);

		A = ArrayUtility.initializeDesc(10000);
		ArrayUtility.print(A);
		startTime = PerformanceLogging.start();
		sort(A, 10000);
		estimatedTime = PerformanceLogging.stop(startTime);
		ArrayUtility.print(A);
		System.out.println("Time Taken = " + estimatedTime);

		A = ArrayUtility.initializeAsc(10000);
		ArrayUtility.print(A);
		startTime = PerformanceLogging.start();
		sort(A, 10000);
		estimatedTime = PerformanceLogging.stop(startTime);
		ArrayUtility.print(A);
		System.out.println("Time Taken = " + estimatedTime);
		/*A = ArrayUtility.initializeDesc(100000);
		ArrayUtility.print(A);
		startTime = PerformanceLogging.start();
		sort(A, 100000);
		estimatedTime = PerformanceLogging.stop(startTime);
		ArrayUtility.print(A);
		System.out.println("Time Taken = " + estimatedTime);
		
		
		A = ArrayUtility.initializeAsc(100000);
		ArrayUtility.print(A);
		startTime = PerformanceLogging.start();
		sort(A, 100000);
		estimatedTime = PerformanceLogging.stop(startTime);
		ArrayUtility.print(A);
		System.out.println("Time Taken = " + estimatedTime);*/
	}
}
