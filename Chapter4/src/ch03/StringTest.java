package ch03;

public class StringTest {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc"); // �� �޸𸮿� ���� �ǹǷ� �ּҰ��� �޶� false ��ȯ
		
		System.out.println(str1 == str2); 
		
		String str3 = "abc";
		String str4 = "abc"; // ���Ǯ�� �ִ� ������ ���� ���� ������ ���ϹǷ� true ��ȯ
		System.out.println(str3 == str4);
		
	}

}
