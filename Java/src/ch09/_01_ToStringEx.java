package ch09;

public class _01_ToStringEx {
	public static void main(String[] arsg) {
		// 매개변수 생성자
		_01_Book book = new _01_Book(1000,"개미");
		System.out.println(book); // .toString()이 생략
		//실행결과 : ch09._01_Book@15db9742 => 패키지명.클래스명@해시코드값
		
		System.out.println(book.toString());
		//실행결과 : ch09._01_Book@15db9742


		
		
		
	}

}
/*
ch09._01_Book@15db9742
ch09._01_Book@15db9742
*/