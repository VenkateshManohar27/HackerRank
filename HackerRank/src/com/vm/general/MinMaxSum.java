package com.vm.general;

import java.util.Scanner;

public class MinMaxSum {

	public MinMaxSum() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        /*long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();*/
        
        long arr[] = new long[5];
        long minimumSum = 0;
        long maximumSum = 0;
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextLong();
        }
        long sumArr[] = new long[5];
        for(int i=0; i < 5; i++){
        	for(int j=0; j < 5; j++){
        		if(i!=j){
        			sumArr[i] += arr[j];
        		}
            }
        	
            if(minimumSum == 0 || sumArr[i] < minimumSum){
            	minimumSum = sumArr[i];
            }
            if(maximumSum == 0 ||  sumArr[i] > maximumSum){
            	maximumSum = sumArr[i];
            }
        }
        
        System.out.print(minimumSum);
        System.out.print(" ");
        System.out.print(maximumSum);
        
        
	}

}
