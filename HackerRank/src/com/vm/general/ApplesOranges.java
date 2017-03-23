package com.vm.general;

import java.util.Scanner;

public class ApplesOranges {

	public ApplesOranges() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        int numOfApples = 0;
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            int distance = a + apple[apple_i];
            if(distance >=s && distance <=t){
            	numOfApples++;
            }
        }
        int[] orange = new int[n];
        int numOfOrange = 0;
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            int distance = b+orange[orange_i];
            if(distance >=s && distance <=t){
            	numOfOrange++;
            }
        }
        System.out.println(numOfApples);
        System.out.println(numOfOrange);
        
    }

}
