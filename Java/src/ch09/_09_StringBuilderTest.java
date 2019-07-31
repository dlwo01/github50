package ch09;
//p.373
public class _09_StringBuilderTest {
	public static void main(String[] args) {
		String javaStr = new String("Java");
		System.out.println("javaStr 문자열 주소 :" + System.identityHashCode(javaStr));
		
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 butter 메모리 주소 :" + System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun");
		System.out.println("연산 후 butter 메모리 주소 :" + System.identityHashCode(buffer));
		//문자열이 추가되도 연산전과연산후 주소값은 같다
		
		javaStr = buffer.toString();
		// toString으로 반환
		System.out.println(javaStr);
		System.out.println("연갈된 javaSrt 문자열 주소 :" + System.identityHashCode(javaStr));
		// 다시 String 형으로 반환한후 주소값이 달라짐
	}

}
/*
javaStr 문자열 주소 :366712642
연산 전 butter 메모리 주소 :1829164700
연산 후 butter 메모리 주소 :1829164700
Java and android programming is fun
연갈된 javaSrt 문자열 주소 :2018699554
*/