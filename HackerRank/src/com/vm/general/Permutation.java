package com.vm.general;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutation {

	public Permutation() {
		// TODO Auto-generated constructor stub
	}
	
	private static ArrayList<String> combinations = new ArrayList<String>();
	
    static void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int r,int lastele)
    {
        if (index == r)
        {
        	StringBuilder sb = new StringBuilder();
        	if(data[data.length-1]==lastele){
	            for (int j=0; j<r; j++){
	            	if(j==0 && data[j]!=0){
	            		sb.append("0,");
	            	}
	            	sb.append(data[j]);
	            	if(j!=r-1){
	            		sb.append(",");
	            	}
	            }
	            combinations.add(sb.toString());
        	}
            return;
        }
 
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r, lastele);
        }
    }
 
    static void generateCombination(int arr[], int n, int r, int lastele)
    {
        int data[]=new int[r];
 
        combinationUtil(arr, data, 0, n-1, 0, r, lastele);
    }
	
    /*Driver function to check for above function*/
    public static void main (String[] args) {
    	Scanner in = new Scanner(System.in);
		int len = in.nextInt();
        int arr[] = new int[len];
        for(int i=0;i<len;i++){
        	arr[i]=i;
        }
        int r = in.nextInt();
        int n = arr.length;
        generateCombination(arr, n, r, arr[arr.length-1]);
        System.out.println(combinations);
        
        for (String s : combinations) {
			int totals = 0;
			String[] index = s.split(",");
			if(index.length==1){
				System.out.println( 0+ " " + Integer.parseInt(index[0]));
			}else{
				for (int i = 0; i < index.length - 1; i++) {
					int start =Integer.parseInt(index[i]);
					int end = Integer.parseInt(index[i + 1]);
					System.out.println(start + " " + end);
					
				}
			}
			

		}
        in.close();
    }

}
