package bronze4;

import java.util.Scanner;
public class ThreeDice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] dice = {0,0,0,0,0,0};
		int max = 0;
		
		for (int i = 1; i <= 3; i++ ) {
			int n = sc.nextInt();
			dice[n-1] += 1; 
			
			if (max <= n) {
				max = n;
			}
			
			
			
		 }
		
	}

}
