package 복습;

public class _56_Main {
	public static void main(String[] args) {
		
		_56_Player player = new _56_Player();
		player.play(1);


		
		_56_AdvancedLevel ad = new _56_AdvancedLevel();
		player.updateLevel(ad);
		player.play(2);
		
		
		_56_SuperLevel sp = new _56_SuperLevel();
		player.updateLevel(sp);
		player.play(3);
	}
}

/*
*** 초보자 레벨입니다. ***
천천히 달립니다.
Jump 못함
Turn 못함
***중급자 레벨입니다.***
빨리 달린다.
높이 jump합니다.
높이 jump합니다.
Turn 못함
***고급자 레벨입니다.***
엄청 빨리 달립니다.
아주 높이 jump합니다.
아주 높이 jump합니다.
아주 높이 jump합니다.
한 바퀴 돕니다.
*/