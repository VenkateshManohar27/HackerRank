package com.vm.daysofcode;

import java.util.Scanner;

public class NestedLogic {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int da = in.nextInt();
		int ma = in.nextInt();
		int ya = in.nextInt();

		int de = in.nextInt();
		int me = in.nextInt();
		int ye = in.nextInt();
		calculate(da, ma, ya, de, me, ye);
		/*calculate(9,6,2015, 9,6 ,2015);
		calculate(9,6,2015, 6,6 ,2015);
		
		calculate(9,6,2015, 6,4 ,2015);
		
		calculate(9,6,2015, 9,6 ,2014);*/
	}

	private static void calculate(int da, int ma, int ya, int de, int me, int ye) {
		if (ya > ye) {
			System.out.println("10000");
		} else if ((ma > me) && (ya == ye)) {
			System.out.println(500 * (ma - me));
		} else if ((da > de) && (ma == me) && (ya == ye)) {
			System.out.println(15 * (da - de));
		} else {//if((da <= de) && (ma <= me) && (ya <= ye)){
			System.out.println(0);
		}
	}

}
