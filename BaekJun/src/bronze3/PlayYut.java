package bronze3;

import java.util.Scanner;

public class PlayYut {
	
	public static int num(int[] arr) { // 1의 갯수 
		int ct = 0;
		for (int n : arr) {
			if (n == 1) {
				ct += 1;
			}
		}
		return ct;
	}
	
	public static String result(int n) {
		if(n == 0) { // 1이 없을 때
			return "D";
		}
		else if(n == 1) {
			return "C";
		}
		else if(n== 2) {
			return "B";
		}
		else if(n==3) {
			return "A";
		}
		else if (n==4) {
			return "E";
		}
		return "";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		for (int i = 1; i <= 3; i++) {
			int[] arr = new int[4];
			arr[0] = sc.nextInt();
			arr[1] = sc.nextInt();
			arr[2] = sc.nextInt();
			arr[3] = sc.nextInt();
			System.out.println(result(num(arr)));
		}
	}

}
