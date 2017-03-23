package com.vm.general;

import java.util.Scanner;

public class MelodiousPassword {
//a,e ,i,o,u
	//b, c, d, f, g, h, j, k, l, m, n, p, q, r, s, t, v, w, x,  z
	private static boolean vowel = false;
	private static char[] vowels  = {'a','e' ,'i','o','u'};
	
	private static char[] consonants  = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','z'};
	
	public MelodiousPassword() {
		// TODO Auto-generated constructor stub
	}
	
	private static char returnCharacter(int i){
		if(vowel){
			return vowels[i];
		}else{
			return consonants[i];
		}
	}
	
	private static void addVowel(StringBuilder str){
		//str.append(arg0);
	}
	
	
	
	
	private static void createPasswordConsonants(int length){
		StringBuilder str = new StringBuilder();
		for(int i= 0;i<consonants.length;i++){
			str.append(consonants[i]);
			if(str.length()==length){
				System.out.println(str);
				str.setLength(0);
			}
		}
	}
	private static void createPasswordVowels(int length){
		StringBuilder str = new StringBuilder();
		for(int i= 0;i<vowels.length;i++){
			str.append(vowels[i]);
			if(str.length()==length){
				System.out.println(str);
				str.setLength(0);
			}
		}
		
				
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        createPasswordConsonants(n);
        createPasswordVowels(n);
        in.close();
    }
}
