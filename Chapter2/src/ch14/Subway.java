package ch14;

public class Subway {

	int subwayLine;
	int passengerCount;
	int money;
	
	public Subway(int subwayLine) {
		this.subwayLine = subwayLine;
		
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount ++;
	}
	
	public void showSubwayInfo() {
		System.out.println(subwayLine + "번의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
	}
}
