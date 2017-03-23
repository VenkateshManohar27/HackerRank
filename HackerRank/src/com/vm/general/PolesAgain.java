package com.vm.general;

import java.util.ArrayList;
import java.util.Scanner;

public class PolesAgain {
	private static int minimumCost = Integer.MAX_VALUE;
	private static int altitudes[] ;
	private static int weights[] ;
	
	private static int calcualteCost(int start, int end, int weight) {
		
		int cost = weight * (end - start);
		return cost;
	}

	private static void combinationUtil(int arr[], int data[], int start, int end, int index, int r) {
		// Current combination is ready to be printed, print it
		if (index == r) {
			int cost = 0;
			if (data[0] == 0) {
				for (int j = 0; j < r; j++){
					int endIndex;
					if(j+1 == r){
						endIndex = end;
					}else{
						endIndex = data[j+1]-1;
					}
					int startIndex=data[j];
					if(startIndex!=endIndex) {
						for(int i=endIndex; i>startIndex;i--){
							cost+=calcualteCost(altitudes[startIndex],altitudes[i], weights[i]);
						}
						
					}
					
					
				}
					
			}
			if(cost !=0 && cost< minimumCost){
				minimumCost = cost;
			}
			return;
		}

		// replace index with all possible elements. The condition
		// "end-i+1 >= r-index" makes sure that including one element
		// at index will make a combination with remaining elements
		// at remaining positions
		for (int i = start; i < end && end - i + 1 >= r - index; i++) {
			data[index] = arr[i];
			combinationUtil(arr, data, i + 1, end, index + 1, r);
		}
	}

	// The main function that prints all combinations of size r
	// in arr[] of size n. This function mainly uses combinationUtil()
	private static void printCombination(int arr[], int n, int r) {
		// A temporary array to store all combination one by one
		int data[] = new int[r];

		// Print all combination using temprary array 'data[]'
		combinationUtil(arr, data, 0, n - 1, 0, r);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		altitudes = new int[n];
		weights = new int[n];
		//int combinationIndex[] = new int[n];
		for (int a0 = 0; a0 < n; a0++) {
			altitudes[a0] = in.nextInt();
			weights[a0] = in.nextInt();
		}
		
		int arr[] = new int[n-1];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		printCombination(arr, n, k);
		System.out.println(minimumCost);
	}
}
