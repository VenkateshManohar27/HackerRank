package com.vm.general;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

	public PlusMinus() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //final DecimalFormat df2 = new DecimalFormat(".######");
        int n = in.nextInt();
        int arr[] = new int[n];
        double positiveCount = 0;
        double negativeCount = 0;
        double zeroCount = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]> 0 ){
            	positiveCount++;
            }else if(arr[arr_i]< 0){
            	negativeCount++;
            }else {
            	zeroCount++;
            }
        }
        /*System.out.println(df2.format(positiveCount/n));
        System.out.println(df2.format(negativeCount/n));
        System.out.println(df2.format(zeroCount/n));
        String.format("%.2f", input)*/
        System.out.println(String.format("%.6f", positiveCount/n));
        System.out.println(String.format("%.6f", negativeCount/n));
        System.out.println(String.format("%.6f", zeroCount/n));
    }
}
