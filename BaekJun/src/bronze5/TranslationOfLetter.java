package bronze5;

import java.util.Scanner;
public class TranslationOfLetter {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String message = sc.next();
		char[] charArray = message.toCharArray();
		
		for (char i : charArray) {
			int k = (int)i;
			if (k <= 90) {
				System.out.print((char)(k+32));
			} else System.out.print((char)(k-32));
		}
	}
}
