package com.vm.general;

import java.util.Scanner;

public class OddEvenChars {

	public OddEvenChars() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			String str = in.nextLine();
			char[] ch = str.toCharArray();
			for(int j=0;j<str.length();j=j+2){
				System.out.print(ch[j]);
			}
			System.out.print(" ");
			for(int j=1;j<str.length();j=j+2){
				System.out.print(ch[j]);
			}
			//System.out.println();
		}
	}
}
