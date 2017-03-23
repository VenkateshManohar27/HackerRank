package com.vm.matrix.absoluteDifference;

import java.util.Scanner;

public class AbsoluteDifference {

	public AbsoluteDifference() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[][] = new int[n][n];
		for (int a_i = 0; a_i < n; a_i++) {
			for (int a_j = 0; a_j < n; a_j++) {
				a[a_i][a_j] = in.nextInt();
			}
		}

		int sumPrimaryDiagonal = 0;
		int sumSecondaryDiagonal = 0;
		for (int a_i = 0; a_i < n; a_i++) {
			sumPrimaryDiagonal += a[a_i][a_i];
			sumSecondaryDiagonal += a[a_i][n-a_i-1];
		}

		
		System.out.println(Math.abs(sumPrimaryDiagonal-sumSecondaryDiagonal));
		/*
		 * for(int a_i=0; a_i < n; a_i++){ for(int a_j=0; a_j < n; a_j++){
		 * System.out.print( a[a_i][a_j] + " "); } System.out.println(); }
		 */

	}
}
