package 복습;

public class _59_Main {
	public static void main(String[] args) {
		_59_Myclass mClass = new _59_Myclass();
		
		//다형성 적용
		_59_XImpl xClass = mClass;
		xClass.x(); // 상위인터페이스 _59_XImpl형으로 대입하면서 _59_XImpl에 선언한 메소드만 호출가능
		
		System.out.println("===========");
		
		_59_YImpl yClass = mClass;
		yClass.y(); // 상위인터페이스 _59_XImpl형으로 대입하면서 _59_XImpl에 선언한 메소드만 호출가능
		
		System.out.println("===========");
		
		//구현한 인터페이스형 변수에 대입하면 인터페이스가 상속한 모든 메소드 호출 가능
		_59_MyMethod myClass = mClass;
		myClass.x();
		myClass.y();
		myClass.myMethod();
	}

}
/*
X-x()
===========
Y-y()
===========
X-x()
Y-y()
My-myMethod()
*/