package ch09;

public class _06_Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		
	/*
	 * Object의 clone() 메소드는 클래스의 인스턴스를 새로 복제하여 생성해 줍니다.
	 * 멤버변수가 동일한 인스턴스가 다른 메모리에 새로 생성된다.
	 * 인스턴스의 멤버변수값은 같고, 주소값은 다른 copyCircle이 생성됨
	 */
	
	_06_Circle circle = new _06_Circle(10,20,30);
	
	// clone() 메소드로 사용해 circle인스턴스를 copyCircle에 복제함
	_06_Circle copyCircle = (_06_Circle)circle.clone(); //Object타입으로 다운캐스팅
	
	
	// 출력결과 : 원점은x=10,y=20이고, 반지름은30입니다.
	System.out.println(circle); //circle.toString()
	System.out.println(copyCircle); // circle.toString()
	System.out.println(System.identityHashCode(circle)); //주소값 : 366712642
	System.out.println(System.identityHashCode(copyCircle)); //주소값 : 1829164700
	
	
	}
}
