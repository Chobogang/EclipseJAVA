package bronze4;

import java.util.Scanner;
public class ReverseStar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int k = n; k >= 1; k--) {
				if (k <= i) {
					System.out.print("*");		
				}		
				else System.out.print(" ");
			}		
			System.out.println();
		}
			
		
	}
	
}

