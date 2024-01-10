package bronze5;

import java.util.Scanner;

public class RemainNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[31];
		
		for(int i = 0; i <= 30; i++) {
			arr[i] = i;
		}
		
		for(int i = 1; i<=28; i++) {
			int call_num = sc.nextInt();
			arr[call_num] = 0;
		}
		
		for(int result : arr) {
			if (result == 0 ) continue;
			System.out.println(result);
		}
		
		sc.close();
				
	}
}
