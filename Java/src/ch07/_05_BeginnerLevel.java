package ch07;

public class _05_BeginnerLevel extends _05_PlayerLevel {

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
		System.out.println("**** 초보자 레벨입니다. ***");
		
	}

}
