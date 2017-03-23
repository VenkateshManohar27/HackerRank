package com.vm.general;

import java.util.Scanner;

public class HourGlass {

	public HourGlass() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        
        int largestMaximumSum = -9999;
        for( int i =0 ;i <4 ; i++){
        	for( int j =0 ;j <4 ; j++){
        		int sum =0;
	        	for(int arr_i=i; arr_i < (i+3); arr_i++){
	                for(int arr_j=j; arr_j < (j+3); arr_j++){
	                	if(arr_i == i+1 ){
	                		if(arr_j == j+1){
	                			sum+=arr[arr_i][arr_j];	
	                		}/*else{
	                			System.out.print(" ");
	                		}*/
	                		
	                	}else{
	                		sum+=arr[arr_i][arr_j];
	                	}
	                }
	                //System.out.println();
	            }
	        	if(sum> largestMaximumSum){
	        		largestMaximumSum = sum;
	        	}
	        	System.out.println("sum :"+ sum);
        	}
        }
        System.out.println("largestMaximumSum :"+ largestMaximumSum);
        System.out.println(largestMaximumSum);
    }
	
}
