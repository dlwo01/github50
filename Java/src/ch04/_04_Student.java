package ch04;

public class _04_Student {
	// 멤버변수
	public String studentName; //학생이름
	public int grade; // 학년
	public int money; // 학생이 가지고 있는 돈
	
	//생성자
	public _04_Student() {}
	public _04_Student(String studentName,int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	//멤버메소드
	//_04_Bus bus = new _04_Bus();
	//버스를탄다
	public void takeBus(_04_Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	//지하철을 탄다
	public void takeSubway(_04_Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	//출력정보
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은" + money + "입니다.");
		
	}

}
