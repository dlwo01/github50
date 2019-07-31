package 복습;

public class _56_BeginnerLevel extends _56_PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	
	}

	@Override
	public void jump() {
		System.out.println("Jump 못함");
		
	}

	@Override
	public void turn() {
		System.out.println("Turn 못함");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*** 초보자 레벨입니다. ***");
		
	}
	

}
