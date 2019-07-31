package 복습;



public class _56_Player {
	private _56_PlayerLevel level;
	//다형성을 쓰기위해 부모 클래스로 객체 형 선언
	
	//디폴트생성자
	public _56_Player() {
		
		level = new _56_BeginnerLevel();// 다형성
		level.showLevelMessage();// 기본레벨 타이틀 출력
		
	}
	
	public _56_PlayerLevel getLevel() {
		return level;
	}
	
	public void updateLevel(_56_PlayerLevel level) {
		this.level = level; // 멤버변수의 레벨
		level.showLevelMessage();// 레벨별로 타이틀 호출
		
	}
	
	public void play(int count) {
		level.go(count);// 템플릿 메소드 호출
	}
}
