package test;

public class _AdvancedLevel extends _ProgrammerLevel {

	@Override
	public void javaP() {
		System.out.println("java 좀 할줄 압니다.");
	}

	@Override
	public void jspP() {
		System.out.println("jsp 할줄 압니다.");
	}

	@Override
	public void springP() {
		System.out.println("spring을 할줄 모릅니다");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***AdvancedLevel 입니다***");
		
	}
} 
