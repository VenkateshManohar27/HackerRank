package com.vm.general;

import java.util.Scanner;

public class StaticInitialize {

	public StaticInitialize() {
		// TODO Auto-generated constructor stub
	}
	static boolean flag = true;
	static int B, H;
	static {
		 
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		
		if(B<= 0 || H<= 0){
			flag = false;
			System.out.println("java.lang.Exception: Breadth and height must be positive" );
		}
	}
	
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		int i = 10;
		
		String s = Integer.toString(i);
	}//end of main

}//end of class

