package 복습2;

public class _02_Player {
	private _02_PlayerLevel level;
	
	public _02_Player() {
		level = new _02_BeginnerLevel();
		level.showLevelMessage();
	}
		public _02_PlayerLevel getLevel() {
		return level;
		
	}
		
		public void updateLevel(_02_PlayerLevel level) {
			this.level = level;
			level.showLevelMessage();
		}
		
		public void play(int count) {
			level.go(count);
			
		}
}
