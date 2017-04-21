package com.vm.utility;

public class ArrayUtility {
	
	public static int[] initializeAsc(int length){
		int[] result = new int[length];
		for (int i = 1; i < result.length; i++) {
			result[i]= i;
		}
		return result;
	}
	
	public static int[] initializeDesc(int length){
		int[] result = new int[length];
		for (int i = 0; i < result.length; i++) {
			result[i]= length --;
		}
		return result;
	}
	
	public static void print(int arr[]) {
		System.out.println("Array is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " |");
		}
		System.out.println();
	}

	public static void print(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " |");
			}
			System.out.println();
		}
		System.out.println();
	}
}
