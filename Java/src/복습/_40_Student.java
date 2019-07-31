package 복습;

public class _40_Student {
	//멤버변수
	public String studentName; // 학생이름
	public int grade; // 학년
	public int money; // 학생이 가지고 있는 돈
	
	//생성자
	public _40_Student() {}//기본생성자출력
	public _40_Student(String studentName,int money) {//매개변수생성자출력
		this.studentName = studentName;
		this.money = money;
	}	
		
	
	//멤버 메소드
	//_40Bus bus = new _40_Bus();
	//버스를 탄다
	public void takeBus(_40_Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	//지하철을 탄다
	public void takesubway(_40_Subway subway) {
		subway.take(1500);
		this.money -=1500;
	}
	
	//출력정보
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은" + money + "입니다." );
		
	}
	
}

	

