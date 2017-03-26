package com.vm.general;

public class RecursionBasics {

	private static int fact(int n) {

		int result;
		System.out.println(n);
		if (n == 1){
			System.out.println("returned 1");
			return 1;
		}
		System.out.println("fact("+(n-1)+")*"+n);
		result = fact(n - 1) * n;
		System.out.println("Result: of fact( "+n+") is "+result);
		return result;

	}

	public static void main(String[] args) {
		System.out.println(fact(10));
		System.out.println(fact(3));
		
	}

}
