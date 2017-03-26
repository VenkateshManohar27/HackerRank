package com.vm.sortingalgorithms;

import com.vm.utility.ArrayUtility;
import com.vm.utility.PerformanceLogging;

/**INSERTION SORT 
 * 
 * PseudoCode
 * Insertion Sort(A, n)								TIME COMPLEXITY
 * 
 *  for i=1 to n-1 				---------------				
 * 		hole = i;				--------------			}
 * 		value = A[i]				----------			} c1
 * 		while( hole>0 && A[hole -1] >value){		}	best case array is sorted so contents 
 * 														in while wont be executed
 * 														 in that case (c1+c3)*(n-1)	= 	O(n)
 * 			A[hole] = A[hole-1];			} c2		}	
 * 			hole --;						} 		}	worst  case- reverse sorted array -
 * 													} 	(c1+c3)*(n-1)
 * 		}												1+2+3+...+n-1 = n(n-1)/2 * c2 = an^2+bn+c = O(n^2) 
 * 		A[hole] = value;					}c3
 * 	}
 * 
 * @author Venkatesh Manohar
 *
 */
public class InsertionSort {
	public static int[] sort(int[] A, int length) {
		for (int i = 1; i < A.length; i++) {
			int value = A[i];
			int hole = i;
			while (hole > 0 && A[hole-1] > value) {
				A[hole] = A[hole - 1];
				hole--;
			}
			A[hole] = value;
		}

		return A;
	}

	public static void main(String[] args) {
		int[] A = ArrayUtility.initializeDesc(10);
		ArrayUtility.print(A);
		long startTime = PerformanceLogging.start();
		sort(A, 10);
		long estimatedTime = PerformanceLogging.stop(startTime);
		ArrayUtility.print(A);
		System.out.println("Time Taken = " + estimatedTime);

		A = ArrayUtility.initializeDesc(100);
		ArrayUtility.print(A);
		startTime = PerformanceLogging.start();
		sort(A, 100);
		estimatedTime = PerformanceLogging.stop(startTime);
		ArrayUtility.print(A);
		System.out.println("Time Taken = " + estimatedTime);

		A = ArrayUtility.initializeDesc(1000);
		ArrayUtility.print(A);
		startTime = PerformanceLogging.start();
		sort(A, 1000);
		estimatedTime = PerformanceLogging.stop(startTime);
		ArrayUtility.print(A);
		System.out.println("Time Taken = " + estimatedTime);

		A = ArrayUtility.initializeDesc(10000);
		ArrayUtility.print(A);
		startTime = PerformanceLogging.start();
		sort(A, 10000);
		estimatedTime = PerformanceLogging.stop(startTime);
		ArrayUtility.print(A);
		System.out.println("Time Taken = " + estimatedTime);

		A = ArrayUtility.initializeAsc(10000);
		ArrayUtility.print(A);
		startTime = PerformanceLogging.start();
		sort(A, 10000);
		estimatedTime = PerformanceLogging.stop(startTime);
		ArrayUtility.print(A);
		System.out.println("Time Taken = " + estimatedTime);
		/*A = ArrayUtility.initializeDesc(100000);
		ArrayUtility.print(A);
		startTime = PerformanceLogging.start();
		sort(A, 100000);
		estimatedTime = PerformanceLogging.stop(startTime);
		ArrayUtility.print(A);
		System.out.println("Time Taken = " + estimatedTime);
		
		
		A = ArrayUtility.initializeAsc(100000);
		ArrayUtility.print(A);
		startTime = PerformanceLogging.start();
		sort(A, 100000);
		estimatedTime = PerformanceLogging.stop(startTime);
		ArrayUtility.print(A);
		System.out.println("Time Taken = " + estimatedTime);*/
	}
	

}
