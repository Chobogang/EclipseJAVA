package ch01;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	private class InClass{
		
		int iNum = 100;
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	static class InStaticClass{
		
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println("InClass num = " + iNum + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
		}
		
		static void sTest() {
//			System.out.println("InClass num = " + iNum + "(외부 클래스의 인스턴스 변수)"); //생성 전이니깐 안될 수 있음
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
		}
	}
	
	
}
public class InnerTest {

	public static void main(String[] args) {

//		OutClass outClass = new OutClass();
//		outClass.usingClass();
//		
//		OutClass.InClass inner = outClass.new InClass(); //이렇게는 만들 수 있지만 내부 클래스가public으로 되어야함
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		
		OutClass.InStaticClass.sTest(); //정적 메서드라 무관하게 바로 호출가능
	}

}
