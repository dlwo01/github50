package ch08;

public class _03_Main {
	public static void main(String[] args) {
		_03_Myclass mClass = new _03_Myclass();
		
		// 다형성 적용
		_03_XImpl xClass =  mClass;
		xClass.x();// 상위인터페이스 _03_XImpl형으로 대입하면 _03_XImpl에 선언한 메소드만 호출가능
		
		System.out.println("==========");
		
		_03_YImpl yClass = mClass;
		yClass.y();// 상위인터페이스 _03_YImpl형으로 대입하면 _03_YImpl에 선언한 메소드만 호출가능
		

		System.out.println("==========");
		
		// 구현한 인터페이스형 변수에 대입하면 인터페이스가 상속한 모든 메소드 호출 가능
		_03_MyImpl myClass = mClass;
		myClass.x();
		myClass.y();
		myClass.myMethod();
		
	}

}
/*
X-x()
==========
Y-y()
==========
X-x()
Y-y()
My-myMethod()
*/