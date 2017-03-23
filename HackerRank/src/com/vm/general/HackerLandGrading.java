package com.vm.general;

import java.util.Scanner;

public class HackerLandGrading {

	public HackerLandGrading() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * public void grading (int grade){
	 * 
	 * }
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int a0 = 0; a0 < n; a0++) {
			int grade = in.nextInt();
			if (grade < 38) {
				System.out.println(grade);
			} else {
				int mod = (grade % 5);
				int grace = 5 - mod;
				if (grace < 3) {
					grade += grace;
					System.out.println(grade);
				} else {
					System.out.println(grade);
				}
			}
		}
	}

}
