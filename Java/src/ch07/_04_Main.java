package ch07;

public class _04_Main {
	public static void main(String[] args) {
		_04_Car car = new _04_AICaR();
		car.run();
		
		System.out.println("==============");
		_04_Car car1 = new _04_ManualCar();
		car1.run();
	}

}
/*
 시동을 켭니다.
자율 주행합니다.
자동차가 알아서 방향을 전환합니다.
스스로 멈춥니다.
시동을 끕니다.
==============
시동을 켭니다.
사람이 운전합니다.
사람이 핸들을 조작합니다.
브레이크로 정지합니다.
시동을 끕니다.
*/
 



