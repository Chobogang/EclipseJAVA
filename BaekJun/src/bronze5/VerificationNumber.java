package bronze5;

import java.util.Scanner;
public class VerificationNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		
	
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			int squares_num = (int) Math.pow(n, 2); // 자바에서의 제곱근 메서드 
			result += squares_num;
		}
		
		sc.close();
	
		System.out.println(result%10);
	}

}
