package com.vm.general;

import java.io.IOException;
import java.util.Scanner;

public class LongestSubstring {

	public LongestSubstring() {
		// TODO Auto-generated constructor stub
	}
	public static void print(int arr[][]) {
		System.out.println("Array is : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	private static int lcs(String str1, String str2) {
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		int l1 = ch1.length;
		int l2 = ch2.length;

		int[][] arr = new int[l1 + 1][l2 + 1];
		int len = 0;

		for (int x = 1; x < l1 + 1; x++) {
			for (int y = 1; y < l2 + 1; y++) {
				if (ch1[x - 1] == ch2[y - 1]) {
					arr[x][y] = arr[x - 1][y - 1] + 1;
					if (arr[x][y] > len) {
						len = arr[x][y];
						
					}
				} else
					arr[x][y] = 0;
			}
		}
		
		print(arr);
		ch1 = null;
		ch2 = null;
		arr = null;
		return len;
	}

	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		int query[][] = new int[q][2];
		String[] s = new String[n];
		for (int s_i = 0; s_i < n; s_i++) {
			s[s_i] = in.next();
		}
		for (int a0 = 0; a0 < q; a0++) {
			int x = in.nextInt();
			int y = in.nextInt();
			query[a0][0] = x;
			query[a0][1] = y;
		}
		in.close();
		
		for (int i = 0; i < query.length; i++) {
			System.out.println( lcs(s[query[i][0]], s[query[i][1]]));
		}
		
	}
}
