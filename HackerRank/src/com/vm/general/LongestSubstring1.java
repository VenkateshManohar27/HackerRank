package com.vm.general;

import java.io.IOException;
import java.util.Scanner;

public class LongestSubstring1 {

	public LongestSubstring1() {
		// TODO Auto-generated constructor stub
	}

	private static int lcs(String str1, String str2) {
		int l1 = str1.length();
		int l2 = str2.length();

		int[][] arr = new int[l1 + 1][l2 + 1];
		int len = 0, pos = -1;

		for (int x = 1; x < l1 + 1; x++) {
			for (int y = 1; y < l2 + 1; y++) {
				if (str1.charAt(x - 1) == str2.charAt(y - 1)) {
					arr[x][y] = arr[x - 1][y - 1] + 1;
					if (arr[x][y] > len) {
						len = arr[x][y];
						// pos = x;
					}
				} else
					arr[x][y] = 0;
			}
		}

		return len;
	}

	/** Main Function **/
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
		for (int i = 0; i < query.length; i++) {
			// String result = lcs(s[query[i][0]], s[query[i][1]]);
			// System.out.println("\nLongest Common Substring : "+ result);
			System.out.println(lcs(s[query[i][0]], s[query[i][1]]));
		}
	}
}
