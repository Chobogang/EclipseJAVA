package bronze2;

import java.util.Scanner;
import java.util.StringTokenizer;
 
public class WordsNumber {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		String S = sc.nextLine();
		sc.close();
 
		// st �� ������ �������� ���� ��ū���� st �� �����Ѵ�
		StringTokenizer st = new StringTokenizer(S," ");
		
		// countTokens() �� ��ū�� ������ ��ȯ�Ѵ�
		System.out.println(st.countTokens());	
		
	}
 
}
