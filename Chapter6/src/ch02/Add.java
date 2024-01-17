package ch02;

@FunctionalInterface // == 함수형 인터페이스 : 내부에 여러 개의 메서드를 선언하면 에러가 난다.
public interface Add {

	public int add(int x, int y);
}
