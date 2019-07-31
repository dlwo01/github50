package ch06;

public class _02_FireCar extends _02_Car {
	
	public _02_FireCar() {
		super.setKind("소방차");
		super.setSpeed(10000);
	}
		
	
	public void water() {
		System.out.println("물을 뿌리다");
	}

}
