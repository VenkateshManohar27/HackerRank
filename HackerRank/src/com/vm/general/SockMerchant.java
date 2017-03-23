package com.vm.general;

import java.util.HashSet;
import java.util.Scanner;

public class SockMerchant {

	public SockMerchant() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        HashSet<Integer> socksSet = new HashSet<Integer>();
        int pairCount = 0;
        for(int c_i=0; c_i < n; c_i++){
        	int value  = in.nextInt();
            c[c_i] = value;
            if(socksSet.contains(value)){
            	socksSet.remove(value);
            	pairCount++;
            }else{
            	socksSet.add(value);
            }
        }
        System.out.println(pairCount);
        in.close();
    }

}
