package com.vm.general;

import java.util.Scanner;

public class Triplets {
	private static int a = 0;
	private static int b = 0;

	public Triplets() {
		// TODO Auto-generated constructor stub
	}

	private static void compare(int ai, int bi) {
		if (ai > bi) {
			a++;
		} else if (ai < bi) {
			b++;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a0 = in.nextInt();
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int b0 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();
		compare(a0, b0);
		compare(a1, b1);
		compare(a2, b2);
		System.out.println(a +" "+ b);
	}

}
