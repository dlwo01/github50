package test;

public class _BeginnerLevel extends _ProgrammerLevel {

	@Override
	public void javaP() {
		System.out.println("java 할 줄 압니다.");
	}

	@Override
	public void jspP() {
		System.out.println("jsp 할줄 모릅니다.");
	}

	@Override
	public void springP() {
		System.out.println("spring을 할줄 모릅니다");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***BeginnerLevel입니다***");
		
	}
} 

