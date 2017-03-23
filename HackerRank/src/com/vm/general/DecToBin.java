package com.vm.general;

import java.util.Scanner;
import java.util.Stack;

public class DecToBin {

	public DecToBin() {
		// TODO Auto-generated constructor stub
	}
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        Stack<Integer> st = new Stack<Integer>();
	        int countConsecutives = 0;
	        while(n > 0){
	    	    int remainder = n%2;
	    	    n = n/2;
	    	    if(!st.isEmpty() && remainder == st.peek()){
	    	    	countConsecutives++;
	    	    }
	    	    st.push(remainder);
	        }
	        while(!st.isEmpty()){
	        	System.out.print(st.pop());
	        }
	        System.out.println();
	        System.out.println("Consecutives:"+countConsecutives);
	        
	        in.close();
	    }
	}
