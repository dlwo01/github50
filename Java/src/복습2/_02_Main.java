package 복습2;

public class _02_Main {
	public static void main(String[] args) {
		_02_Player player = new _02_Player();
		player.play(1);
		
		
		
		_02_AdvancedLevel be = new _02_AdvancedLevel();
		player.updateLevel(be);
		player.play(2);
		
		
		_02_SuperLevel su = new _02_SuperLevel();
		player.updateLevel(su);
		player.play(3);
	}

}
