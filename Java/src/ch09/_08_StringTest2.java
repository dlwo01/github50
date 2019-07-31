package ch09;

public class _08_StringTest2 {
	public static void main(String[] args) {
		
		String javaStr = new String("java");
		String androidStr = new String("android");
		
		
		System.out.println("javaStr :" + javaStr); // javaStr : java
		System.out.println("처음 문자열 주소값 :" + System.identityHashCode(javaStr));//처음 문자열 주소값 :366712642
		
		System.out.println("=========================");
		System.out.println("androidStr :" + androidStr);//androidStr :android
		javaStr=javaStr.concat(androidStr);
		System.out.println("javaStr :" + javaStr);// javaStr :javaandroid
		System.out.println("처음 문자열 주소값 :" + System.identityHashCode(javaStr));//처음 문자열 주소값 :1829164700
	}

}
