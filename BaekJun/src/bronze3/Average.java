package bronze3;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int i = sc.nextInt();
		
		if(a == 1 || i == 1) {
			System.out.println(a * i);
		} else System.out.println((a * (i-1)) + 1);
	}

}
