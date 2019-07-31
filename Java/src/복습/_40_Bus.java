package 복습;

public class _40_Bus {
	// 멤버변수
	int busNumber; // 버스번호
	int passengerCount; //승객수
	int money; 
	
	
	//생성자
	public _40_Bus() {}//기본생성자 호출
	
	public _40_Bus(int busNumber) { //매개변수 생성자호출
		this.busNumber = busNumber;
	}
	
	// 멤버메소드
	// 버스를 타면 버스 수입 증가,승객수 증가
	public void take(int money) {
		this.money += money; // 버스 수입증가
		passengerCount++; // 승객수 증가
	}
	
	//출력정보
	//버스를 탄다
	public void showInfo( ) {
		System.out.println("버스" + busNumber + "번의 승객은" + passengerCount + "명 입니다.");
		System.out.println("수입은" + money + "입니다.");
		
	}
	

}
