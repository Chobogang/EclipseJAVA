package ch14;

public interface Calc {

	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() { // default 메서드 : 인터페이스에서 구현된 메서드를 생성할 떄 사용
		System.out.println("정수의 사칙연산을 제공합니다.");
		myMethod();
	}
	
	static int total (int[] arr) {
		int total = 0;
		for(int num : arr) {
			total += num;
			
		}
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("myMethod");
	}
	
	private static void myStaticMethod() {
		System.out.println("MyStaticMethod");
	}
}
