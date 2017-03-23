package com.vm.general;

import java.util.Scanner;

public class Recursion {

	public Recursion() {
		// TODO Auto-generated constructor stub
	}
	
	public static int factorial(int n){
		if(n<=1){
			return 1;
		} else {
			return n*factorial(n-1);
		}
	}
	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 int n = in.nextInt();
		 System.out.println(factorial(n));
		 in.close();
	 }
	 
}
