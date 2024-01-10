package bronze4;

import java.util.Scanner;
public class HumanCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int p = sc.nextInt();
		
		int result = l * p;
		
		int[] news = new int[5];
		
		news[0] = sc.nextInt();
		news[1] = sc.nextInt();
		news[2] = sc.nextInt();
		news[3] = sc.nextInt();
		news[4] = sc.nextInt();
		
		for (int n : news) {
			System.out.print(n - result + " ");
		}
	}

}
