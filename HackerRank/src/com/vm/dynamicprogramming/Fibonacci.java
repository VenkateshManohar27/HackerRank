package com.vm.dynamicprogramming;

import com.vm.utility.PerformanceLogging;

public class Fibonacci {

	private static int[] fib = new int[1000];
	static {
		System.out.println("Initialized");
		fib[0] = 0;
		fib[1] = 1;
	}

	public static int fibonacciDp(int n) {
		// fib = new int[n+1];

		for (int i = 2; i <= n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}

		return fib[n];
	}

	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	private static void print(int n) {
		long start = PerformanceLogging.start();
		int result = fibonacci(n);
		System.out.println("fib(" + n + ") = " + result + " , Took:" + PerformanceLogging.stop(start));
		System.out.println();

	}
	private static void printDp(int n) {
		long start = PerformanceLogging.start();
		int result = fibonacciDp(n);
		System.out.println("DP fib(" + n + ") = " + result + " , Took:" + PerformanceLogging.stop(start));
		System.out.println();
	}

	public static void main(String[] args) {
		print(3);
		print(4);
		print(5);
		print(15);
		print(30);
		print(39);
		printDp(2);
		printDp(3);
		printDp(4);
		printDp(5);
		printDp(15);
		printDp(30);
		printDp(39);

	}
}