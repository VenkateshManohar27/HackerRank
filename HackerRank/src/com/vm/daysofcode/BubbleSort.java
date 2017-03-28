package com.vm.daysofcode;

import java.util.Scanner;

public class BubbleSort {
	public static void sort(int[] A, int length) {
		int numberOfSwaps = 0;
		for (int i = 0; i < A.length ; i++) {
			
			for (int j = 0; j < A.length-i-1; j++) {
				if(A[j]>A[j+1]){
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
					numberOfSwaps++;
				}
				
			}
			// If no elements were swapped during a traversal, array is sorted
		    if (numberOfSwaps == 0) {
		        break;
		    }
		}

		System.out.println("Array is sorted in "+numberOfSwaps+" swaps.");
		System.out.println("First Element: "+A[0]);
		System.out.println("Last Element: "+A[A.length-1]);
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        sort(a, n);
    }
}
