package com.vm.general;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

	public PhoneBook() {
		// TODO Auto-generated constructor stub
	}

	 public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        HashMap<String, Integer> phbook = new HashMap<String, Integer>();
	        for(int i = 0; i < n; i++){
	            String name = in.next();
	            int phone = in.nextInt();
	            phbook.put(name, phone);
	        }
	        while(in.hasNext()){
	            String s = in.next();
	            Integer found = phbook.get(s);
	            if(found == null){
	            	System.out.println("Not found");
	            }else{
	            	System.out.println(s+"="+found);
	            }
	        }
	        in.close();
	    }
}
