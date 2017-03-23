package com.vm.general;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TrianglesInGraph {

	public TrianglesInGraph() {
		// TODO Auto-generated constructor stub
	}
	private static Set<Integer> set = new HashSet<Integer>();
	private static void countTriangle(int graph[][]) {
		int count_Triangle = 0; // Initialize result

		// Consider every possible triplet of edges in graph
		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph[i].length; j++) {
				for (int k = 0; k < graph.length; k++) {
					// check the triplet if it satisfies the condition
					if ((graph[i][j] == 1) && (graph[j][k] == 1) && (graph[k][i] == 1)) {
						count_Triangle++;
						if(count_Triangle == 1 ){
							set.add(i);
							set.add(j);
							set.add(k);
						}else {
							int size = set.size();
							boolean i1 = set.contains(i);
							boolean j1 = set.contains(j);
							boolean k1 = set.contains(k);
							if(!i1)size++;
							if(!j1)size++;
							if(!k1)size++;
							if((size/count_Triangle)==2){
								if(!i1)set.add(i);
								if(!j1)set.add(j);
								if(!k1)set.add(k);
							}
							if(i1 && j1 && k1){
								count_Triangle--;
							}
							
						}
						
					}

				}
			}
		}

		count_Triangle /= 6;
		System.out.println(set.size());
		for(Integer s :set){
			System.out.print((s+1)+" ");
		}
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] g = new int[n][n];
		for (int g_i = 0; g_i < n; g_i++) {
			for (int g_j = 0; g_j < n; g_j++) {
				g[g_i][g_j] = in.nextInt();
			}
		}
		countTriangle(g);
	}

}
