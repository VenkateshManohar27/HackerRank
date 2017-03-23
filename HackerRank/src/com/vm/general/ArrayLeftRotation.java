package com.vm.general;

import java.util.Scanner;

public class ArrayLeftRotation {

	public ArrayLeftRotation() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int rotation = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}

		for (int arr_i = 0; arr_i < n; arr_i++) {
			System.out.print(arr[arr_i] + " ");
		}
	}

}
