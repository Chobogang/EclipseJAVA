package bronze3;

import java.util.Scanner;

public class RectangleEscape {
	
	public static int min(int n1, int n2, int n3, int n4) {
		int arr[] = {n1, n2, n3, n4};
		int bigNum = 1001;
		for (int n : arr) {
			if (n <= bigNum) {
				bigNum = n;
			}
		}
		return bigNum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int i = w - x;
		int k = h - y;
		
		System.out.println(min(x,y,i,k));
		
	}

}
