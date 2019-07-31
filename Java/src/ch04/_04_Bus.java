package ch04;

public class _04_Bus {
	// 멤버변수
	int busNumber; // 버스번호
	int passengerCount; // 승객수
	int money;
	
	
	// 생성자
	public _04_Bus() {}
	public _04_Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	
	// 멤버메소드
	// 버스를 타면 버스 수입 증가,승객수 증가
	public void take(int money) {
		this.money += money; // 버스 수입 증가
		passengerCount++;	// 승객수 증가
	}	
	
	// 출력정보
	// 버스를 탄다
	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은" + passengerCount + "명");
		System.out.println("수입은" + money + "입니다.");
	}
	

}
