package ch10;

public class _01_GenericPrinter<T> {
	private T material; // T 자료형을 선언한 변수
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	@Override
	public String toString() {
		return material.toString();
	}

}
