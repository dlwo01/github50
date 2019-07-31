package ch06;

public class _01_Animal {
	// 멤버변수
	protected String kind;
	protected int legs;
	
	
	// 디폴트 생성자
	public _01_Animal() {}
	
	// 멤버메소드
	public void eat() {
		System.out.println("먹다~~");
	}
	public void sleep() {
		System.out.println("자다~~");
	}
	public void play() {
		System.out.println("놀다~~");
	}
	
	public void print() {
		System.out.println("kind :" + kind + " , " + "legs :" +legs);
	}
}
