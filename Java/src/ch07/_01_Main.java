package ch07;

public class _01_Main {
	public static void main(String[] args) {
		
		// 추상클래스는 객체생성 불가
		// _01_Animal ani = new _01_Animal(); // 오류
		
		_01_Bird bi = new _01_Bird();
		bi.eat();
		bi.move();
		
		System.out.println();
		
		// 다형성 적용시 자식쪽의 오버라이드된 메소드가 호출된다.
		_01_Animal ani = new _01_Bird();
		ani.eat();
		ani.move();
		
		System.out.println();
		
		_01_Fish fi = new _01_Fish();
		fi.eat();
		fi.move();
		
		
		System.out.println();
		
		// 다형성 적용
		_01_Animal ani1 = new _01_Fish();
		ani1.eat();
		ani1.move();
		
	}
}
