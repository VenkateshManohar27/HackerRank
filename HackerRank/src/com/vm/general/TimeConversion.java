package com.vm.general;

import java.util.Scanner;

public class TimeConversion {

	public TimeConversion() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        String time = in.next();*/
		String arr[] = {"12:00:00AM", "12:00:00PM", "07:05:45PM", "07:05:45AM","11:05:45PM","11:05:45AM"};
        for(String time : arr){
		String hour = time.substring(0, 2);
        boolean pm = false;
        if(time.endsWith("PM")){
        	pm = true;
        	time = time.replaceFirst("PM", "");
        	if(!hour.equals("12")){
	        	int hour24 = Integer.parseInt(hour);
	        	hour24 +=12;
	        	//hour24 = hour24 %24;
	        	String hourfinal = String.valueOf(hour24);
	        	time = time.replaceFirst(hour, hourfinal);
        	}
        }else{
        	time = time.replaceFirst("AM", "");
        	if(hour.equals("12")){
        		time = time.replaceFirst(hour, "00");
        	}
        }
        
        System.out.println(time);
        }
    }

}
