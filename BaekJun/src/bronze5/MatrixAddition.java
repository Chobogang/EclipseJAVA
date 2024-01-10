package bronze5;

import java.util.Scanner;
public class MatrixAddition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr1 = new int[n][m];
		int[][] arr2 = new int[n][m];
		
		for(int i = 0; i <= n-1; i++) {
			for(int k = 0; k <= m-1; k++) {
				arr1[i][k] = sc.nextInt();
			}
		}
				
		for(int i = 0; i <= n-1; i++) {
			for(int k = 0; k <= m-1; k++) {
				arr2[i][k] = sc.nextInt();
			}
	}
	
		for (int i = 0; i < n; i++) {
			for(int k=0; k < m; k++) {
				 
				System.out.print((int)arr1[i][k] + (int)arr2[i][k] + " ");
			}
			System.out.println();
		} 


	}
}
