package bronze3;

import java.util.Scanner;

public class OvenClock {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		
		int addNum = m + c;
		
		while(addNum >= 60) { // while ���� ��ȣ �� ������ �����ϸ� ��� ���ư���.
			addNum -= 60;
			t += 1;
		}
		if (t >= 24) {
			t -= 24;
		}
		System.out.println(t + " " + addNum);
	}

}
