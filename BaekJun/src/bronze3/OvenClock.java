package bronze3;

import java.util.Scanner;

public class OvenClock {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		
		int addNum = m + c;
		
		while(addNum >= 60) { // while 문은 괄호 안 조건이 성립하면 계속 돌아간다.
			addNum -= 60;
			t += 1;
		}
		if (t >= 24) {
			t -= 24;
		}
		System.out.println(t + " " + addNum);
	}

}
