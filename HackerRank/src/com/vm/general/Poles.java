package com.vm.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Poles {

	private static int minimumCost = Integer.MAX_VALUE;
	private static ArrayList<String> combinations = new ArrayList<String>();

	private static int calcualteCost(int start, int end, int weight) {
		int cost = weight * (start - end);
		return cost;
	}

	static void combinationUtil(int arr[], int data[], int start, int end, int index, int r, int lastele) {
		if (index == r) {
			StringBuilder sb = new StringBuilder();
			if (data[data.length - 1] == lastele) {
				for (int j = 0; j < r; j++) {
					if (j == 0 && data[j] != 0) {
						sb.append("0,");
					}
					sb.append(data[j]);
					if (j != r - 1) {
						sb.append(",");
					}
				}
				combinations.add(sb.toString());
			}
			return;
		}

		for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
			data[index] = arr[i];
			combinationUtil(arr, data, i + 1, end, index + 1, r, lastele);
		}
	}

	static void generateCombination(int arr[], int n, int r, int lastele) {
		int data[] = new int[r];

		combinationUtil(arr, data, 0, n - 1, 0, r, lastele);
	}

	private static int minCost(int cost[][], int start, int end, int length) {
		int finalCost = 0;

		for (int i = start; i < end; i++) {
			finalCost += cost[i][end];
		}
		return finalCost;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int cost[][] = new int[n][n];
		int altitudes[] = new int[n];
		int weights[] = new int[n];
		int combinationIndex[] = new int[n];
		
		for (int a0 = 0; a0 < n; a0++) {
			altitudes[a0] = in.nextInt();
			weights[a0] = in.nextInt();
		}
		
		for (int i = n - 1, m = 0; i >= 0 && m < n; i--, m++) {
			for (int j = n - 1, p = 0; j >= 0 && p < n; j--, p++) {
				if (altitudes[i] != altitudes[j] && altitudes[i] > altitudes[j]) {
					cost[m][p] = calcualteCost(altitudes[i], altitudes[j], weights[i]);
				}
			}
		}
		for (int i = 0; i < n; i++) {
			combinationIndex[i] = i;
		}
		int len = combinationIndex.length;
		generateCombination(combinationIndex, len, k, combinationIndex[combinationIndex.length - 1]);

		for (String s : combinations) {
			int totals = 0;
			String[] index = s.split(",");
			for (int i = 0; i < index.length - 1; i++) {
					int start = Integer.parseInt(index[i]);
					if(start !=0){
						start++;
					}
					int end = Integer.parseInt(index[i + 1]);
					totals += minCost(cost, start, end, n);
			}
			if (totals < minimumCost) {

				minimumCost = totals;
				
			}

		}
		System.out.println(minimumCost);
	}

}
