package ch03;

public class StringTest2 {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");
		
		System.out.println(System.identityHashCode(java));
		java = java.concat(android);
		
		System.out.println(System.identityHashCode(java)); // 연결 시 다른 메모리가 생성 됨. 즉 주소가 바뀜
	}

}
