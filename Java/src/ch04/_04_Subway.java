package ch04;

public class _04_Subway {
	String lineNumber;	// 지하철 노선
	int passengerCount;	// 승객수
	int money;
	
	public _04_Subway() {}
	public _04_Subway(String lineNumber) {
		this.lineNumber = lineNumber;
		
	}
	
	
	//멤버메소드
	public void take(int money) {
		this.money += money;// 수입증가
		passengerCount++;
	}
	
	// 출력정보
	public void showInfo() {
		System.out.println(lineNumber + "의 승객은" + passengerCount + "명");
		System.out.println("수입은" + money + "입니다.");
	}

}
