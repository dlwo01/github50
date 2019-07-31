package ch07;

public class _05_Player {
	private _05_PlayerLevel level; // 부모클래스타입 참조변수;  == int,String이랑 같은의미
	// 다형성을 쓰기위해 부모클래스로 객체 형 선언
	
	//디폴트 생성자
	public _05_Player() {
		//_05_PlayerLevel level = new _05_BeginnerLevel(); 
		level = new _05_BeginnerLevel(); // 다형성
		level.showLevelMessage();// 기본레벨 타이틀 출력
		
	}	
	
	public _05_PlayerLevel getLevel() {
		return level;
		
	}
	
	public void updateLevel(_05_PlayerLevel level) {
		
		this.level = level;// 멤버변수의 레벨 멤머변수 level =  매개변수 주소값
		level.showLevelMessage();// 레벨별로 타이틀 호출
		
	}
	
	public void play(int count) {
		level.go(count);// 템플릿 메소드호출
		// 이 level은 부모클래스의 참조 변수
		// 부모 클래스에서 go를 호출
		
	}
}
