package bronze3;

import java.util.Scanner;

public class TeamNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int totalNum = n + m;
		
		int ct = 0;
		int internship = 0;
		
		while (true) {
			if (n -2 < 0 || m-1 < 0) {
				break;
			}
			n -= 2;
			m -= 1;
			totalNum -= 3;
			ct += 1;
		}
		while(true) {
			if (totalNum - k < 0) {
				ct -= 1;
				totalNum += 3;
			}
			else break;
		}
		
		System.out.println(ct);
	}

}
