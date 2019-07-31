package ch09;

public class _05_HashCodeTest {
	public static void main(String[] args) {
		/*
		 * String 클래스와 , Integer 클래스의 equals() 메소드와 hashCode() 메소드는 재정의 되어있다.
		 */
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		//String 클래스는 같은 문자열을 가진경우, 즉 equals() 메소드의 결과값이 true인 경우
		//hashCode() 메소드는 동일한 해시 코드값을 반환한다.
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		
		// Integer 클래스의 hashCode() 메소드는 정수값을 반환하도록 재정의되어있다.
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
	}

}
/*
96354
96354
100
100
*/