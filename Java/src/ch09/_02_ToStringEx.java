package ch09;

public class _02_ToStringEx {
	public static void main(String[] arsg) {
		// 매개변수 생성자
		_02_Book book = new _02_Book(1000,"개미");
		
		//toString()메소드는 _02)Book 클래스에서 재정의된 메소드가 호출된다.(Object 클래스가 아닌)
		System.out.println(book); // .toString()이 생략
		//실행결과 : 개미,1000
		
		System.out.println(book.toString());
		//실행결과 : 개미,1000


		
		
		
	}

}
/*
개미,1000
개미,1000
*/