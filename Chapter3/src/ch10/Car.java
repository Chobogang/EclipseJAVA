package ch10;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar(){
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff(){
		System.out.println("�õ��� ���ϴ�.");
	}
	
	// �� �޼��� : ������ �޼��������� �ʿ信���� �������̵� �ؼ� ����ص� �ǰ� ��� ���ص� �ȴ�.
	public void washCar() {
		
	}
	
	//���ø� �޼��� : ���ϸ� �ȵǰ� �޼������ �帧��� �귯���� ��
	public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
	
}
