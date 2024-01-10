package bronze4;

import java.util.Scanner;
public class Dice {
	
	public static int maxArr(int n1, int n2, int n3) {
		int[] arr = {n1, n2, n3};
		int maxNum = 0;
		
		for(int n : arr) {
			if (maxNum <= n) {
				maxNum = n;
			}
		}
		return maxNum;
	}

	public static void main(String[] args) {

		int ct = 0;
		int result;
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if(n1 == n2 && n2 == n3) {
			result = 10000 + (n1 * 1000);
		}
		else if (n1 == n2 || n2 == n3 || n1 == n3) {
			if(n1 == n2) {
				result = 1000 + (n1 * 100);
			}
			else if (n2 == n3) {
				result = 1000 + (n2 * 100);
			}
			else result = 1000 + (n1 * 100);
		}
		else {
			result = (maxArr(n1, n2, n3) * 100);
		}
		
		System.out.println(result);
	}

}

