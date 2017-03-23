package com.vm.daysofcode;

import java.util.Scanner;

class Difference {
	private int[] elements;
	public int maximumDifference = Integer.MIN_VALUE;

	public Difference(int[] elements) {
		super();
		this.elements = elements;
	}

	public void computeDifference() {
		int minimumElement = Integer.MAX_VALUE;
		int maximumElement = Integer.MIN_VALUE;

		for (int i = 0; i < elements.length; i++) {
			if (elements[i] < minimumElement) {
				minimumElement = elements[i];
			}
			if(elements[i] > maximumElement){
				maximumElement = elements[i];
			}
			
		}
		maximumDifference = maximumElement - minimumElement;

	}

}

public class MaximumDifference {

	public MaximumDifference() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}
