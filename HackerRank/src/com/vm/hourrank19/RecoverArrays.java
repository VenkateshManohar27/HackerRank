package com.vm.hourrank19;

import java.util.Scanner;

public class RecoverArrays {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] file = new int[n];
        for(int file_i=0; file_i < n; file_i++){
            file[file_i] = in.nextInt();
        }
        int count=0;
        int arrayIndex = 0;
        
        for(int i=0; i < n; ){
        	arrayIndex += file[i]+1;
        	i=arrayIndex;		
        	count++;
        }
        System.out.println(count);
        
    } 

}
