package com.vm.general;

import java.util.Scanner;

public class MinimumNumbers {

	public MinimumNumbers() {
		// TODO Auto-generated constructor stub
	}
	
	public static StringBuilder min(StringBuilder s){
		StringBuilder sb = new StringBuilder();
		if(s.length()==0){
			sb.append("min(int, int)");
		}else{
			sb.append("min(int, ").append(s).append(")");
		}
		
		
		return sb;
	}
	
	public static String solveRecursive(int n) {
		if(n==1)return "int";
		return "min(int, "+solveRecursive(n-1)+")";
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder s = new StringBuilder();
        int n = in.nextInt();
        for(int i=2;i<=n;i++){
        	s= min(s);
        }
        System.out.println(s.toString());
        System.out.println("Recursive way");
        System.out.println(solveRecursive(n));
        
        in.close();
    }
}
