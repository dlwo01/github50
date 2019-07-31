package ch06;

public class _02_PoliceCar extends _02_Car{
	public _02_PoliceCar() {
		super.setKind("경찰차");
		super.setSpeed(10000000);
	}
	
	public void siren() {
		System.out.println("사이렌을 울리다");
	}

}
