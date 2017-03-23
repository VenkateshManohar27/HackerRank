package com.vm.general;

import java.util.Scanner;

public class MelodiousPassword2 {

	private static char[] vowels  = {'a','e' ,'i','o','u'};
	
	private static char[] consonants  = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','z'};
	private static int i =0;
	private static void printCombinations(boolean vowel, int length, int n, StringBuilder prefix){
		
        if(n == length){
        	i++;
            System.out.println(i+" "+prefix);
            prefix.setLength(prefix.length()-1);
            return;
        }else{
        	if(vowel){
        		for(int i= 0;i<consonants.length;i++){
        			
        			prefix.append(consonants[i]);
        			printCombinations(false,prefix.length(), n, prefix);
        		}
        		
        	}else{
        		for(int i= 0;i<vowels.length;i++){
        			
        			prefix.append(vowels[i]);
        			printCombinations(true,prefix.length(), n, prefix);
        		}
        	}
        }
        
    }

	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //StringBuilder sb = new StringBuilder();
        for(int i= 0;i<consonants.length;i++){
        	StringBuilder sb = new StringBuilder();
        	sb.append(consonants[i]);
        	printCombinations(false,1, n, sb);
        }
        for(int i= 0;i<vowels.length;i++){
        	StringBuilder sb = new StringBuilder();
        	sb.append(vowels[i]);
        	printCombinations(true,1, n, sb);
        }
       // printCombinations(true,0, n, null);
        in.close();
    }
}
