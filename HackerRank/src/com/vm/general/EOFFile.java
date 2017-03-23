package com.vm.general;

import java.util.ArrayList;
import java.util.Scanner;

public class EOFFile {

	public EOFFile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//ArrayList<String> lines = new ArrayList<String>();
		int i = 1;
		while (sc.hasNext()) {
			//lines.add(sc.nextLine());
			System.out.println(i + " " + sc.nextLine());
			i++;
		}
		
		/*for (String s : lines) {
			System.out.println(i + " " + s);
			i++;
		}*/
		sc.close();
	}
}
