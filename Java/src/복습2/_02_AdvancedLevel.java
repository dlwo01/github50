package 복습2;

public class _02_AdvancedLevel extends _02_PlayerLevel {

	@Override
	public void run() {
		System.out.println("빨리 달린다.");
		
	}

	@Override
	public void jump() {
		System.out.println("높이 jump합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("Turn 못함");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***중급자 레벨입니다***");
		
	}

}
