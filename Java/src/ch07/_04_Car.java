package ch07;

public abstract class _04_Car {
	public abstract void drive(); // 추상메소드
	public abstract void stop(); // 추상메소드
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//템플릿 메소드 : 틀이 있는 메소드이며, 재정의 되지 않도록 final로 선언
	//자동차가 달리는 방법을 순서대로 구현
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
	

}
