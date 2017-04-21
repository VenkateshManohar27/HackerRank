package com.vm.greedyalgorithms;

import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
	
	
	
	public static void main(String[] args) {
		
		int s[] =  {1, 3, 0, 5, 8, 5};
	    int f[] =  {2, 4, 6, 7, 9, 9};
	    int n = s.length;
	        
	    logSortedActivitiesSelected(s, f);
	    
	    Integer[][] arr = {{5, 9}, {1, 2}, {3, 4}, {0, 6},
                {5, 7}, {8, 9}};
	    
	    
	    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	    
	    logUnSortedActivitiesSelected(arr);

	}

	private static void logUnSortedActivitiesSelected(Integer[][] arr) {
		Arrays.sort(arr, new Comparator<Integer[]>() {

			@Override
			public int compare(Integer[] arg0, Integer[] arg1) {
				
				return (arg0[1] >arg1[1])?1:(arg0[1] == arg1[1])?0:-1;
			}
			
		});
		
		int previousFinishTime = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(previousFinishTime <= arr[i][0]){
				System.out.println("Index selected :" +i);
				System.out.println("Start time :" +arr[i][0]+" , end time:"+ arr[i][1]);
				previousFinishTime = arr[i][1];
			}
		}
	}

	private static void logSortedActivitiesSelected(int[] s, int[] f) {
		int previousFinishTime = 0;
		
		for (int i = 0; i < s.length; i++) {
			if(previousFinishTime <= s[i]){
				System.out.println("Index selected :" +i);
				System.out.println("Start time :" +s[i]+" , end time:"+ f[i]);
				previousFinishTime = f[i];
			}
		}
		
	}
	
	

}
