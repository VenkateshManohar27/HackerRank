package com.vm.general;

import java.util.Scanner;

public class ArrayReverse {

	public ArrayReverse() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        for(int i=n-1; i >= 0; i--){
            System.out.print(arr[i]);
            System.out.print(' ');
        }
        in.close();
    }
}
