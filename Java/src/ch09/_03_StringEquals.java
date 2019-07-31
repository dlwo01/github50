package ch09;

import org.omg.PortableInterceptor.INACTIVE;

public class _03_StringEquals {
	public static void main(String[] args) {
		String st1 = new String("abc");
		String st2 = new String("abc");
		
		// 두 인스턴스의 주소값이 같은지 비교하여 출력
		System.out.println(st1 == st2);// false 주소값 다름
		
		// String 클래스의 equals() 메소드는 같은 문자열의 경우 true, 다른 문자열의 경우 false를 반환하도록 재정의 되어있다.
		System.out.println(st1.equals(st2));//true 값 같음
		
		
		Integer i1 = new Integer(1000);
		Integer i2 = new Integer(1000);
		
		// 두 인스턴스의 주소값이 같은지 비교하여 출력
		System.out.println(i1 == i2); // 주소값이 다름 false
		
		// Integer 클래스의 equals() 메소드 사용.. 두 인스턴스의 정수값이 같은지 비교(재정의 되어 있다.)
		System.out.println(i1.equals(i2)); //값은 같음 true
		
	}
	

}
