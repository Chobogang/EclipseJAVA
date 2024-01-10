package bronze3;

import java.util.Scanner;
public class Plug {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int ct = 0;
		int result = 1;
		
		for (int i = 0; i < n; i++) {
			result += sc.nextInt();
			ct += 1;
		}
		
		System.out.println(result - ct);
	}
}
