package ch09;

public class _07_StringTest1 {
	public static void main(String[] args) {
		
		/*
		 * 상수풀
		 * 리터럴은 프로그램이 시작할 때 시스템에 같이 로딩되어 특정메모리 공간인 상수풀에 들어간다.
		 * 		리터럴  -> 로딩	 	->	상수풀(값) 	->  대입/복사	->	변수 num				
		 * 리터럴
		 * 숫자, 문자, 논리값 		  3,abc,boolean 		 			3	int a =3;
		 * 
		 * 값 3이 메모리공간(상수풀)에 존재하고, 그 값이 복사되어 num 변수에 대입된다.
		 */
		
		// str1, str2는 동적메모리 공간인 힙메모리 주소이다.
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		// "==" : 주소값 비교, 인스턴스가 매번 새로 생성되므로 str1과 str2의 주소값이 다름
		System.out.println(str1 == str2); // false
		
		// "equals" : 값을 비교한다.  , 문자열 값은 "abc" 같으므로 true 반환
		System.out.println(str1.equals(str2)); // true
		
		
		// str3, str4는 상수풀의 주소이다.
		String str3 = "abc";
		String str4 = "abc";
		
		// 문자열 abc는 상수풀에 저장되어 있으므로 str3와 str4 가 가리키는 주소값이 같음
		System.out.println(str3 == str4); // true
		
		// 문자열 값도 같으므로 true 반환
		System.out.println(str3.equals(str4)); // true
		
		
	}


}
