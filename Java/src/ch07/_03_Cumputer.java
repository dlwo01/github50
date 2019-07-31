package ch07;

public abstract class _03_Cumputer {
	public abstract void display(); // 추상메소드
	public abstract void typing(); // 추상메소드
	
	public void turnOn() {
		System.out.println("전원을 켜다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끄다.");
	}

}
