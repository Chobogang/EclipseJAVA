package bronze3;

import java.util.Scanner;

public class EarlyAlarm {
//��� �ð� 45�� ���� �˶� �︮��.
	public static void main(String[] args) {
		Scanner put = new Scanner(System.in);
		
		int H = put.nextInt();
		int M = put.nextInt();
		
		if (M < 45) {
			M = 15 + M;
			if(H<=0) {
				H = 23;
			} else if (H>0) {
				H = H - 1;
			}
			System.out.println(H + " " +M);
		} else {
			M = M-45;
			System.out.println(H + " " +M);
		}
		
		
		}
	
}