import java.util.Scanner;

public class TidyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] numbers = new long[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextLong();
		}
        sc.close();
		for (int i = 0; i < numbers.length; i++) {
			StringBuilder sb = new StringBuilder();
			for (int digit = 0; digit < 9; digit++){
				for (long temp = numbers[i]; temp > 0; temp /= 10){
					if (temp % 10 == digit){
						sb.append(digit);
					}
				}
			}
			if(sb.charAt(0) == '0'){
				 long temp = Long.parseLong(sb.toString());
				 long result = numbers[i] -temp;
				 sb = new StringBuilder(String.valueOf(result));
			}else if(sb.length()>1){
				long temp = Long.parseLong(sb.toString());
				int digit = (int) (temp%10);
				int diff = 9 - digit;
				for (int j = diff; j >0; j--) {
					if((temp+diff) < numbers[i]){
						sb = new StringBuilder(String.valueOf((temp+diff)));
					}
				}
			}
			System.out.println(sb);

		}
		
	}

}
