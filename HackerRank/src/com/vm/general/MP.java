package com.vm.general;

import java.util.Scanner;

public class MP {
	private static char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

	private static char[] consonants = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't',
			'v', 'w', 'x', 'z' };
	private static int counter = 0;

	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < consonants.length; i++) {
			if (n == 1) {
				counter++;
				System.out.println(counter+" "+consonants[i]);
			} else {
				for (int j = 0; j < vowels.length; j++) {
					if (n == 2) {
						counter++;
						System.out.println(counter+" "+consonants[i] + vowels[j]);
					}else{
						for(int k= 0;k<consonants.length;k++){ 
							if (n == 3) {
								counter++;
								System.out.println(counter+" "+consonants[i] + vowels[j]+consonants[k]);
							}else{
								for(int l= 0;l<vowels.length;l++){
									if (n == 4) {
										counter++;
										System.out.println(counter+" "+consonants[i] + vowels[j]+consonants[k]+vowels[l]);
									}else{
										for(int m= 0;m<consonants.length;m++){
											if (n == 5) {
												counter++;
												System.out.println(counter+" "+consonants[i] + vowels[j]+consonants[k]+vowels[l]+consonants[m]);
											}else{
												for(int o= 0;o<vowels.length;o++){
													if (n == 6) {
														counter++;
														System.out.println(counter+" "+consonants[i] + vowels[j]+consonants[k]+vowels[l]+consonants[m]+vowels[o]);
													}
														
												}
											}
												
										}
									}
										
								}
							}
						}
					}
				}

			}
		}
		
		for (int i = 0; i < vowels.length; i++) {
			if (n == 1) {
				counter++;
				System.out.println(counter+" "+vowels[i]);
			} else {
				for (int j = 0; j < consonants.length; j++) {
					if (n == 2) {
						counter++;
						System.out.println(counter+" "+vowels[i] + consonants[j]);
					}else{
						for(int k= 0;k<vowels.length;k++){ 
							if (n == 3) {
								counter++;
								System.out.println(counter+" "+vowels[i] + consonants[j]+vowels[k]);
							}else{
								for(int l= 0;l<consonants.length;l++){
									if (n == 4) {
										counter++;
										System.out.println(counter+" "+vowels[i] + consonants[j]+vowels[k]+consonants[l]);
									}else{
										for(int m= 0;m<vowels.length;m++){
											if (n == 5) {
												counter++;
												System.out.println(counter+" "+vowels[i] + consonants[j]+vowels[k]+consonants[l]+vowels[m]);
											}else{
												for(int o= 0;o<consonants.length;o++){
													if (n == 6) {
														counter++;
														System.out.println(counter+" "+vowels[i] + consonants[j]+vowels[k]+consonants[l]+vowels[m]+consonants[o]);
													}
														
												}
											}
												
										}
									}
										
								}
							}
						}
					}
				}

			}
		}

		/*
		 * public static void main(String[] args) { Scanner in = new
		 * Scanner(System.in); int n = in.nextInt(); //StringBuilder sb = new
		 * StringBuilder(); for(int i= 0;i<consonants.length;i++){ StringBuilder
		 * sb = new StringBuilder(); sb.append(consonants[i]); if(n>=2){ for(int
		 * j= 0;j<vowels.length;j++){ sb.append(vowels[j]); if(n>=3){ for(int k=
		 * 0;k<consonants.length;k++){ sb.append(consonants[k]); if(n>=4){
		 * for(int l= 0;l<vowels.length;l++){ sb.append(vowels[l]); if(n>=5){
		 * 
		 * }else{ counter++; System.out.println(counter+" "+sb);
		 * sb.setLength(sb.length()-3); } } }else{ counter++;
		 * System.out.println(counter+" "+sb); sb.setLength(sb.length()-2); }
		 * 
		 * } }else{ counter++; System.out.println(counter+" "+sb);
		 * sb.setLength(sb.length()-1); } } }else{ counter++;
		 * System.out.println(counter+" "+sb); }
		 * 
		 * } for(int i= 0;i<vowels.length;i++){ StringBuilder sb = new
		 * StringBuilder(); sb.append(vowels[i]); if(n>=2){ for(int j=
		 * 0;j<consonants.length;j++){ sb.append(consonants[j]); if(n>=3){
		 * for(int k= 0;k<vowels.length;k++){ sb.append(vowels[k]); if(n>=4){
		 * for(int l= 0;l<consonants.length;l++){ sb.append(consonants[l]);
		 * if(n>=5){
		 * 
		 * }else{ counter++; System.out.println(counter+" "+sb);
		 * sb.setLength(sb.length()-3); } } }else{ counter++;
		 * System.out.println(counter+" "+sb); sb.setLength(sb.length()-2); } }
		 * }else{ counter++; System.out.println(counter+" "+sb);
		 * sb.setLength(sb.length()-1); }
		 * 
		 * } }else{ counter++; System.out.println(counter+" "+sb); } }
		 */
		// printCombinations(true,0, n, null);
		in.close();
	}
}
