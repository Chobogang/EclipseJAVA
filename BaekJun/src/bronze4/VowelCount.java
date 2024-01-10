package bronze4;

import java.util.Scanner;
public class VowelCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[] charArray = {'a', 'e', 'u', 'o', 'i', 'A', 'E', 'U', 'O', 'I'};
		
		while (true) {
			String sentence = sc.nextLine();
			if (sentence.equals("#")) break;
			int result = 0;
			
			char[] inputSentence = sentence.toCharArray(); // toCharArray = ���ڿ��� �ѹ��� ���ҷ� �����ϴ� �޼���
			
			for (char word : inputSentence ) {
				for (char  vowel : charArray) {
					if(word == vowel) {
						result += 1;						
					}
				}
			}
			System.out.println(result);
		}
		
		sc.close();
	}

}
