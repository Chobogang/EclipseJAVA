package ch08;

public class Order {

	String orderNum;
	String phoneNum;
	String address;
	int orderDay;
	int orderTime;
	int orderPrice;
	int menuNum;
	
	public Order(String orderNum, String phoneNum, String address, int orderDay, int orderTime, int orderPrice, int menuNum) {
		this.orderNum = orderNum;
		this.phoneNum = phoneNum;
		this.address = address;
		this.orderDay = orderDay;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.menuNum = menuNum;
	}
	
	public void showInfo() {
		System.out.println("�ֹ� ���� ��ȣ : " + orderNum);
		System.out.println("�ֹ� �ڵ��� ��ȣ : " + phoneNum);
		System.out.println("�ֹ� �� �ּ� : " + address);
		System.out.println("�ֹ� ��¥ : " + orderDay);
		System.out.println("�ֹ� �ð� : " + orderTime);
		System.out.println("�ֹ� ���� : " + orderPrice);
		System.out.println("�ֹ� �޴� : " + menuNum);
	}
}
