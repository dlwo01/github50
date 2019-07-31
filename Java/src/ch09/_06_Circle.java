package ch09;

public class _06_Circle implements Cloneable {
	// 멤버변수
	_06_Point point; // 클래스타입 참조변수;
	int radius;
	
	// 기본생성자
	public _06_Circle() {}
	// 매개변수생성자
	public _06_Circle(int x, int y, int radius) {
		point = new _06_Point(x, y);
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "원점은" + point + "이고, " + "반지름은" + radius + "입니다."; // point = point.toString()이 생략되있음
		
	}
	// clone() 호출시 Cloneable 인터페이스를 구현할 떄 발생할 수 있는 오류를 예외처리
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		// clone() Object에 있다
	}

}
