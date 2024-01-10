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
		System.out.println("주문 접수 번호 : " + orderNum);
		System.out.println("주문 핸드폰 번호 : " + phoneNum);
		System.out.println("주문 집 주소 : " + address);
		System.out.println("주문 날짜 : " + orderDay);
		System.out.println("주문 시간 : " + orderTime);
		System.out.println("주문 가격 : " + orderPrice);
		System.out.println("주문 메뉴 : " + menuNum);
	}
}
