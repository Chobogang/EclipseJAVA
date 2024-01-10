package bronze4;

import java.util.Scanner;
import java.util.Arrays;
public class ArrayAlignment {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		
		Arrays.sort(arr);
		
		for (int n : arr) {
			System.out.print(n + " ");
		}
	}

}
