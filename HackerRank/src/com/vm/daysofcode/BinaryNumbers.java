package com.vm.daysofcode;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryNumbers {

	public BinaryNumbers() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int count = 0;
		int tempCount = 0;
		while (n>0){
			int remainder = n%2;
			n= n/2;
			if(remainder ==1){
				tempCount++;
				if(tempCount>count){
					count = tempCount;
				}
			}else{
				tempCount = 0;
			}
		}
		System.out.println(count);
	}
}
