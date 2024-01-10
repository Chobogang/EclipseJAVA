package bronze5;

import java.util.Scanner;
public class ArrayElementCompare {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] chess = {1, 1, 2, 2, 2, 8};
		int[] w_chess = new int[6];
		
		for (int i = 0; i < w_chess.length; i++) {
			w_chess[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.print(chess[i] - w_chess[i] + " ");
		}
		
		
	}

}
