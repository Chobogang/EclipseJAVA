package ch02;

public class AddTesta {

	public static void main(String[] args) {

		// 람다식 표현
		Add addL = (x, y) -> {return x+y;}; //return 포함시 중괄호 필수
		Add addI = (x, y) -> x+y; // return 제외
		System.out.println(addL.add(2,3));
	}

}
