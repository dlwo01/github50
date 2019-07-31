package ch13;

public class _04_Main {
	public static void main(String[] args) {
		/*
		 * enum : 열거형
		 * 1. 정의 : 여러개의 상수들을 모아서 만든 객체를 의미한다.
		 * 2. 작성방법 : enum 열거형명{상수1,상수2,상수3...}
		 * 3. 용도 : 제한된 상수값을 사용하고자 할 때
		 * 4. 접근방법 : 열거형명.상수
		 * 5. 특징 : switch(변수)에서 변수타입으로 enum을 사용할 수 있다.
		 * 			ordinal() 메소드를 이용해서 순서값을 얻어올 수 있다.
		 * 			ordinal()은 0부터 시작한다.
		 */
		System.out.println(_04_Week.SUN);// SUN
		System.out.println(_04_Week.SUN.ordinal());// 0
		System.out.println(_04_Week.FRI);// FRI
		System.out.println(_04_Week.FRI.ordinal()); //5
		
		System.out.println("======================");
		String weekend ="";
		switch(_04_Week.MON.ordinal()) {
		case 0 : 
			weekend = "일";
			break;
		case 1 : 
			weekend = "월";
			break;
		case 2 : 
			weekend = "화";
			break;
		case 3 : 
			weekend = "수";
			break;
		case 4 :
			weekend = "목";
			break;
		case 5 :
			weekend = "금";
			break;
		case 6 :
			weekend = "토";
			break;
		
		}
		System.out.println("요일" + weekend);
		System.out.println("=================");
	}
	
}
