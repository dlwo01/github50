package ch07;

public class _04_ManualCar extends _04_Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("브레이크로 정지합니다.");
		
	}
	

}
