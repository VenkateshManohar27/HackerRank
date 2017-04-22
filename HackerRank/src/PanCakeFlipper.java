

import java.util.Scanner;

public class PanCakeFlipper {
	
	public static int flip(String s, int k, int caseno, int count){
		if(!s.contains("-")){
			return count;
		}
		int ind = s.indexOf("-");
		int len = s.length();
		if(!((ind+k) <= len)) return -1;
		char[] arr = s.toCharArray();
		for (int i = ind; i < (ind+k); i++) {
			if(arr[i] =='+'){
				arr[i] ='-';
			}else{
				arr[i]='+';
			}
		}
		count++;
		s = new String(arr);
		count = flip(s,k,caseno,count);
		return count;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String[] s = new String[T];
		int[] K = new int[T];
        for (int i = 0; i < T; i++) {
			s[i] = sc.next();
			K[i] = sc.nextInt();
		}
        sc.close();
        for (int i = 0; i < T; i++) {
        	
        	int result = flip(s[i], K[i], i, 0);
        	if(result == -1) {
        		System.out.println("Case #"+(i+1)+": IMPOSSIBLE" );
        	}else{
        		System.out.println("Case #"+(i+1)+": "+result );
        	}
		}
        
		
	}

}
