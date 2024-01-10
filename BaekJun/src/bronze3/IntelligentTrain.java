package bronze3;

import java.util.Scanner;

public class IntelligentTrain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int currentMan = 0;
		int maxMan = 0;
		
		for (int i = 1; i <= 4; i++) {
			int outMan = sc.nextInt();
			int inMan = sc.nextInt();
			
			if (maxMan <= currentMan - outMan + inMan) {
				maxMan = currentMan - outMan + inMan;
			}
			currentMan = currentMan - outMan + inMan;
		}
		System.out.println(maxMan);
	}

}
