package ch03;

public class StringTest {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc"); // 힙 메모리에 저장 되므로 주소값이 달라 false 반환
		
		System.out.println(str1 == str2); 
		
		String str3 = "abc";
		String str4 = "abc"; // 상수풀에 있는 것으로 참조 변수 값만을 비교하므로 true 반환
		System.out.println(str3 == str4);
		
	}

}
