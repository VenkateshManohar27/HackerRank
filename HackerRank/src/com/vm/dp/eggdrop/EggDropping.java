package com.vm.dp.eggdrop;

import java.util.Scanner;

import com.vm.utility.ArrayUtility;

public class EggDropping {
	
public int calculate(int eggs, int floors){
        
        int T[][] = new int[eggs+1][floors+1];
        int c =0;
        for(int i=0; i <= floors; i++){
            T[1][i] = i;
        }
        
        for(int e = 2; e <= eggs; e++){
            for(int f = 1; f <=floors; f++){
                T[e][f] = Integer.MAX_VALUE;
                for(int k = 1; k <=f ; k++){
                    c = 1 + Math.max(T[e-1][k-1], T[e][f-k]);
                    if(c < T[e][f]){
                        T[e][f] = c;
                    }
                }
            }
        }
        return T[eggs][floors];
    }
    
    public int calculateRecursive(int eggs, int floors){
        if(eggs == 1){
            return floors;
        }
        if(floors == 0){
            return 0;
        }
        int min = 1000;
        for(int i=1; i <= floors; i++){
            int val = 1 + Math.max(calculateRecursive(eggs-1, i-1),calculateRecursive(eggs, floors-i));
            if(val < min){
                min = val;
            }
        }
        return min;
    }
    
    /*public static void main(String args[]){
        EggDropping ed = new EggDropping();
        int r = ed.calculate(3,100);
        System.out.println(r);
    }*/

	private static int eggDrop(int floors, int eggs) {
		/*if (eggs == 0 || floors == 0) {
			return 0;
		}

		if (eggs == 1) {
			return floors;
		}*/

		int[][] arr = new int[eggs+1][floors+1];
		for (int i = 1; i <= floors; i++) {
			arr[1][i] = i;
		}
		int count = 0;

		/*
		 * int i = eggs; int j = 0;
		 */

		for (int k = 2; k < arr.length; k++) {
			for (int j = 1; j <= floors; j++) {
				arr[k][j] = Integer.MAX_VALUE;
				for (int i = 1; i <=j; i++) {
					int val =  1+ Math.max(arr[k-1][i-1], arr[k][j-i]);
					if(val< arr[k][j]){
						arr[k][j] = val;
					}
				}
				
			}

		}
		ArrayUtility.print(arr);
		return arr[eggs][floors];
	}

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int floors = sc.nextInt();
		int eggs = sc.nextInt();

		eggDrop(floors, eggs);
		sc.close();*/
		System.out.println(eggDrop(4, 2));
		System.out.println(eggDrop(100, 3));
		System.out.println(eggDrop(100, 1));
		
		 EggDropping ed = new EggDropping();
	        int r = ed.calculate(3,100);
	        System.out.println(r);
	}

}
