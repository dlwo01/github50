package ch09;

public class _06_Point {
	//멤버변수
	int x;
	int y;
	
	//기본 생성자
	public _06_Point() {}
	//매개변수 생성자
	public _06_Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x=" + x +","+"y="+ y;
		
	}

}
