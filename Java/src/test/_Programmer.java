package test;

public class _Programmer {
			private _ProgrammerLevel level;

		public _Programmer() {
			level = new _BeginnerLevel();
			level. showLevelMessage();
	
	}

		public _ProgrammerLevel getLevel() {
			return level;

	}

		public void upgradeLevel(_ProgrammerLevel level) {
			this.level = level;
			level.showLevelMessage();

	}

		public void create(int count) {
			level.temp(count);

	}

}

