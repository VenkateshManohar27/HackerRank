package com.vm.general;

import java.util.Scanner;

public class Kangaroo {

	public Kangaroo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		if (v1 <= v2) {
			System.out.println("NO");
		} else {
			while (x1 < x2 && v1 > v2) {
				x1 = x1 + v1;
				x2 = x2 + v2;
				if (x1 == x2) {
					System.out.println("YES");
					break;
				} else if (x1 > x2 && v1 >= v2) {
					System.out.println("NO");
					break;
				}
			}
		}
		in.close();
		/*
		 * int x= x2-x1; if(((x%v1)==0 )&&((x%v2)==0 )){
		 * System.out.println("YES"); }else{ System.out.println("NO");
		 * 
		 * } for(int i=0;i<10000000;i++){ x1+=v1; x2+=v2;
		 * //System.out.println(x1+"=="+x2); if(x1==x2){
		 * System.out.println("YES"); break; } else { System.out.println("NO");
		 * } } }
		 * 
		 */

	}
}
