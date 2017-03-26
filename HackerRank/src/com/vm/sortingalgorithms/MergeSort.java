package com.vm.sortingalgorithms;

import com.vm.utility.ArrayUtility;
import com.vm.utility.PerformanceLogging;

/**Divide and conquer strategy
 * Recursive algorithm
 * stable sorting algorithm
 * Not an in place algorithm
 * Space complexity O(n)
 * Time Complexity O(nlogn)
 * 
 * 
 * @author Venkatesh Manohar
 *
 */
public class MergeSort {
	private static int[] helper;

	public static int[] merge(int a[], int start, int mid, int end) {
		//System.out.println("start :" + start + ", mid:" + mid + ", end:" + end);
		for (int i = start; i <= end; i++) {
			helper[i] = a[i];
		}
		int k = start;
		int i = start;
		int j = mid + 1;
		while (i <= mid && j <= end) {
			if(helper[i] < helper[j]){
				a[k] = helper[i];
				i++;
			}else{
				a[k] = helper[j];
				j++;
			}
			k++;
		}
		
		while (i <= mid) {
            a[k] = helper[i];
            k++;
            i++;
		}

		return a;
	}

	public static int[] mergeSort(int a[], int start, int end) {
		if (helper == null) {
			helper = new int[a.length];
		}
		//System.out.println("start: a[" + start + "] , end: a[" + end + "]");
		//ArrayUtility.print(a);
		if (start < end) {
			int mid = (int) Math.floor((start + end) / 2);

			mergeSort(a, start, mid);
			mergeSort(a, mid + 1, end);
			merge(a, start, mid, end);
		}
		//System.out.println("Returned");
		return a;
	}

	public static int[] sort(int[] A) {
		int n = A.length;
		helper = new int[n];
		mergeSort(A, 0, n - 1);
		return A;
	}
	
	public static void main(String[] args) {
		int[] A = ArrayUtility.initializeDesc(10);
		ArrayUtility.print(A);
		long startTime = PerformanceLogging.start();
		sort(A);
		long estimatedTime = PerformanceLogging.stop(startTime);
		ArrayUtility.print(A);
		System.out.println("Time Taken = " + estimatedTime);

		A = ArrayUtility.initializeDesc(100);
		ArrayUtility.print(A);
		startTime = PerformanceLogging.start();
		sort(A);
		estimatedTime = PerformanceLogging.stop(startTime);
		ArrayUtility.print(A);
		System.out.println("Time Taken = " + estimatedTime);

		A = ArrayUtility.initializeDesc(1000);
		ArrayUtility.print(A);
		startTime = PerformanceLogging.start();
		sort(A);
		estimatedTime = PerformanceLogging.stop(startTime);
		ArrayUtility.print(A);
		System.out.println("Time Taken = " + estimatedTime);

		A = ArrayUtility.initializeDesc(10000);
		ArrayUtility.print(A);
		startTime = PerformanceLogging.start();
		sort(A);
		estimatedTime = PerformanceLogging.stop(startTime);
		ArrayUtility.print(A);
		System.out.println("Time Taken = " + estimatedTime);

		A = ArrayUtility.initializeAsc(10000);
		ArrayUtility.print(A);
		startTime = PerformanceLogging.start();
		sort(A);
		estimatedTime = PerformanceLogging.stop(startTime);
		ArrayUtility.print(A);
		System.out.println("Time Taken = " + estimatedTime);
		
		/*A = ArrayUtility.initializeDesc(100000);
		ArrayUtility.print(A);
		startTime = PerformanceLogging.start();
		sort(A);
		estimatedTime = PerformanceLogging.stop(startTime);
		ArrayUtility.print(A);
		System.out.println("Time Taken = " + estimatedTime);
		
		
		A = ArrayUtility.initializeAsc(100000);
		ArrayUtility.print(A);
		startTime = PerformanceLogging.start();
		sort(A);
		estimatedTime = PerformanceLogging.stop(startTime);
		ArrayUtility.print(A);
		System.out.println("Time Taken = " + estimatedTime);*/
	}

}
