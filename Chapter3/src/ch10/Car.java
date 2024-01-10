package ch10;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar(){
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff(){
		System.out.println("시동을 끕니다.");
	}
	
	// 훅 메서드 : 구현된 메서드이지만 필요에따라 오버라이드 해서 사용해도 되고 사용 안해도 된다.
	public void washCar() {
		
	}
	
	//템플릿 메서드 : 변하면 안되고 메서드들이 흐름대로 흘러가는 것
	public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
	
}
