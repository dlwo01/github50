package ch06;

public class _02_CarMain {
	public static void main(String[] args) {
		_02_FireCar car = new _02_FireCar();
		car.printInfo();
		car.water();
		car.setSpeed(0);
		car.printInfo();
		car.water();
		
		_02_PoliceCar pil = new _02_PoliceCar();
		pil.printInfo();
		pil.siren();
		
	}

}
