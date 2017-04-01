package com.vm.daysofcode;

import java.util.Scanner;

public class PrimeNumber {

	private static void prime(int n) {
		if (n == 2) {
			System.out.println("Prime");
			return;
		}
		if (n <= 1 || n % 2 == 0) {
			System.out.println("Not prime");
			return;
	    }
		boolean flag = true;
		int sqrt = (int)Math.sqrt(n);
		for (int i = 3; i < sqrt; i+=2) {
			if(n%i==0){
				System.out.println("Not prime");
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println("Prime");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			prime(a[i]);
		}
		sc.close();
	}
	
	/*public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int numTests = scanner.nextInt();

	    for (int i = 0; i < numTests; i++) {
	        int num = scanner.nextInt();
	        
	        boolean isPrime = testPrime(num);
	        if (isPrime) {
	            System.out.println("Prime");
	        } else {
	            System.out.println("Not prime");
	        }
	    }
	}

	private static boolean testPrime(int num) {
	    
	    if (num == 2) { // 2 is the "oddest" prime
	        return true;
	    }

	    if (num <= 1 || num % 2 == 0) {
	        return false;
	    }

	    int sqrtNum = (int) Math.sqrt(num);
	    for (int i = 3; i <= sqrtNum; i += 2) {
	        if (num % i == 0) {
	            return false;
	        }
	    }

	    return true;
	}*/
}
