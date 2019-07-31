package ch04;

public class _01_ProductMainEx2 {
	public static void main(String[] args) {
		/*
		 * 객체 생성 : 클래스명(주소값의대상) => 참조변수명(주소값) = new 클래스명=(생성자)();
		 * 		접근 : 참조변수명,멤버변수;
		 * 			 참조변수명.멤버메소드;
		 * 
		 * 참조변수명에는 생성한 객체의 메모리공간 주소값이 들어있다.
		 * 앞에 클래스명은 데이터타입이고, 참조변수로 접근할 때 사용한다.
		 * 뒤의 클래스명은 메모리에 객체생성시 사용되는 생성자이다.
		 */
		// 객체 생성 : 클래스명 참조변수명 = new 클래스명();
		
		_01_Product2 pro = new _01_Product2();
		
		
		pro.setProduce("핸드폰");
		pro.setSmartphone("스마트폰");
		pro.setIphone("아이폰6s");
		pro.setPrice("꽁짜폰");
		pro.setApple("사과");
		pro.printIfo();
		
		
		_01_Product2 pro2 = new _01_Product2("핸드폰","스마트폰","아이폰6s","꽁짜폰","사과");
		pro2.printIfo();
		
		
	
		
	
	}
	
	
		 
	}


