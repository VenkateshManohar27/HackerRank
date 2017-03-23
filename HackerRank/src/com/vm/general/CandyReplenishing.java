package com.vm.general;

import java.util.Scanner;

public class CandyReplenishing {

	public CandyReplenishing() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();
		int[] c = new int[t];
		for (int c_i = 0; c_i < t; c_i++) {
			c[c_i] = in.nextInt();
		}
		int candiesAddedCount = 0;
		int counter = n;
		for (int i = 1; i <= t; i++) {
			counter = counter - c[i - 1];
			if (i != t) {
				if (counter < 5) {
					candiesAddedCount += n - counter;
					counter = n;
				}
			}
		}
		System.out.println(candiesAddedCount);
		in.close();
	}
}
